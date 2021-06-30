package uk.cmdrnorthpaw.needle.book.page

import kotlinx.serialization.Serializable
import uk.cmdrnorthpaw.needle.resources.ResourceLocation

@Serializable
class CraftingRecipePage(
    val recipe: ResourceLocation,
    val recipe2: ResourceLocation = ResourceLocation.EMPTY,

    val title: String = "",
    val text: String = ""
) : Page("patchouli:crafting")

@Serializable
class SmeltingRecipePage(
    val recipe: ResourceLocation,
    val recipe2: ResourceLocation = ResourceLocation.EMPTY,

    val title: String = "",
    val text: String = "",
) : Page("patchouli:smelting")