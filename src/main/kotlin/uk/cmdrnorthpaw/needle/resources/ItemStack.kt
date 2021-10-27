package uk.cmdrnorthpaw.needle.resources

import com.google.gson.*
import java.lang.reflect.Type

class ItemStack @JvmOverloads constructor(
    val namespace: String,
    val path: String,
    val count: Int = 1,
    val nbt: JsonObject? = null
) {
    object Serializer : uk.cmdrnorthpaw.needle.model.Serializer<ItemStack> {
        override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): ItemStack {
            val jsonString = json?.asString!!
            val splitString = jsonString.split(':', '#', '{')

            val namespace = splitString[0]
            val path = splitString[1]
            val count = if (jsonString.contains('#')) splitString[2].toInt() else 1
            val jsonObject = if (jsonString.contains('{')) {
                    JsonParser.parseString(jsonString.removePrefix("$namespace:$path#$count"))
                } else null

            return ItemStack(namespace, path, count, jsonObject?.asJsonObject)
        }

        override fun serialize(src: ItemStack?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
            src!!
            val initialJson = "${src.namespace}:${src.path}#${src.count}"

            return if (src.nbt == null) JsonPrimitive(initialJson)
            else JsonPrimitive(initialJson + Gson().toJson(src.nbt))
        }
    }
}
