package uk.cmdrnorthpaw.needle.book.page

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import uk.cmdrnorthpaw.needle.resources.ResourceLocation

@Serializable
class EntityPage(
    val entity: ResourceLocation,

    val scale: Float = 1F,
    val offset: Float = 1F,

    val rotate: Boolean = true,
    @SerialName("default_rotation") val defaultRotation: Float = -45F,
) : Page("patchouli:entity")