package uk.cmdrnorthpaw.needle.resources

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonElement
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import java.lang.reflect.Type

@JvmInline
value class Colour(val hex: Int) {
    object Serializer: uk.cmdrnorthpaw.needle.model.Serializer<Colour> {
        override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): Colour {
            json!!
            return Colour(json.asString.toInt(radix = 16))
        }

        override fun serialize(src: Colour?, typeOfSrc: Type?, context: JsonSerializationContext?): JsonElement {
            return JsonPrimitive(src!!.hex.toString(16))
        }
    }
}

typealias Color = Colour
