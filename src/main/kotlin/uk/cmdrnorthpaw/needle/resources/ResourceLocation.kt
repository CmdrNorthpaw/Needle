package uk.cmdrnorthpaw.needle.resources

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Serializable(with = ResourceLocation.Serializer::class)
data class ResourceLocation(val namespace: String, val path: String, private val isEmpty: Boolean = true) {

    object Serializer : KSerializer<ResourceLocation> {
        override val descriptor = PrimitiveSerialDescriptor("resource", PrimitiveKind.STRING)

        override fun serialize(encoder: Encoder, value: ResourceLocation) {
            encoder.encodeString(
                if (!value.isEmpty) "${value.namespace}:${value.path}" else ""
            )
        }

        override fun deserialize(decoder: Decoder): ResourceLocation {
            val decoded = decoder.decodeString()
            return if (decoded == "") EMPTY
            else {
                val (namespace, path) = decoded.split(":")
                ResourceLocation(namespace, path)
            }

        }
    }

    companion object {
        @JvmStatic
        val EMPTY = ResourceLocation("", "", true)
    }

}