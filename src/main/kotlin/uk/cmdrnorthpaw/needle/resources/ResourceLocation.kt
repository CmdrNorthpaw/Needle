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
data class ResourceLocation(val namespace: String, val path: String) {

    object Serializer : KSerializer<ResourceLocation> {
        override val descriptor = PrimitiveSerialDescriptor("resource", PrimitiveKind.STRING)

        override fun serialize(encoder: Encoder, value: ResourceLocation) {
            encoder.encodeString("${value.namespace}:${value.path}")
        }

        override fun deserialize(decoder: Decoder): ResourceLocation {
            val decoded = decoder.decodeString()
            val (namespace, path) = decoded.split(":")
            return ResourceLocation(namespace, path)
        }
    }

}