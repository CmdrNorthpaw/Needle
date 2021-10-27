package uk.cmdrnorthpaw.needle.resources

import com.google.gson.*
import uk.cmdrnorthpaw.needle.model.Serializer
import java.lang.reflect.Type


data class ResourceLocation(val namespace: String, val path: String, private val isEmpty: Boolean = false) {

    object Serializer : uk.cmdrnorthpaw.needle.model.Serializer<ResourceLocation> {
        override fun deserialize(json: JsonElement?, typeOfT: Type?,
                                 context: JsonDeserializationContext?): ResourceLocation {
            if (json?.asString == "" || json == null) return EMPTY

            val split = json.asString.split(":")
            return ResourceLocation(split[0], split[1])
        }

        override fun serialize(
            src: ResourceLocation?,
            typeOfSrc: Type?,
            context: JsonSerializationContext?
        ): JsonElement {
            return if (src == null || src.isEmpty) JsonPrimitive("")
            else JsonPrimitive("${src.namespace}:${src.path}")
        }
    }

    companion object {
        @JvmStatic
        val EMPTY = ResourceLocation("", "", true)
    }

}