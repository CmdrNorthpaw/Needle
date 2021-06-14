package uk.cmdrnorthpaw.needle.resources

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@JvmInline
@Serializable(with = Colour.Serializer::class)
value class Colour(val hex: Int) {
    object Serializer: KSerializer<Colour> {
        override val descriptor = PrimitiveSerialDescriptor("colour", PrimitiveKind.STRING)

        override fun serialize(encoder: Encoder, value: Colour) {
            encoder.encodeString(value.hex.toString().removePrefix("0x"))
        }

        override fun deserialize(decoder: Decoder): Colour {
            return Colour(decoder.decodeString().toInt())
        }
    }
}

typealias Color = Colour
