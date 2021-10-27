package uk.cmdrnorthpaw.needle.resources

import com.google.gson.*
import uk.cmdrnorthpaw.needle.model.Serializer
import java.lang.reflect.Type


data class ResourceLocation(val namespace: String, val path: String) {

    object Serializer : uk.cmdrnorthpaw.needle.model.Serializer<ResourceLocation> {
        override fun deserialize(json: JsonElement?, typeOfT: Type?,
                                 context: JsonDeserializationContext?): ResourceLocation? {

            if (json == null) return null
            val split = json.asString.split(":")
            return ResourceLocation(split[0], split[1])
        }

        override fun serialize(
            src: ResourceLocation?,
            typeOfSrc: Type?,
            context: JsonSerializationContext?
        ): JsonElement {
            src!!
            return JsonPrimitive("${src.namespace}:${src.path}")
        }
    }
}