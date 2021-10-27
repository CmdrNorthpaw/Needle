package uk.cmdrnorthpaw.needle.book.page

import com.google.gson.annotations.SerializedName
import uk.cmdrnorthpaw.needle.resources.ResourceLocation

class EntityPage(
    val entity: ResourceLocation,

    val scale: Float = 1F,
    val offset: Float = 1F,

    val rotate: Boolean = true,
    @SerializedName("default_rotation") val defaultRotation: Float = -45F,
) : Page("patchouli:entity")