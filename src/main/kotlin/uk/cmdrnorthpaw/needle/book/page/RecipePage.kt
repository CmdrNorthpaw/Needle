package uk.cmdrnorthpaw.needle.book.page

import uk.cmdrnorthpaw.needle.resources.ResourceLocation

class CraftingRecipePage(
    val recipe: ResourceLocation,
    val recipe2: ResourceLocation? = null,

    val title: String = "",
    val text: String = ""
) : Page("patchouli:crafting")

class SmeltingRecipePage(
    val recipe: ResourceLocation,
    val recipe2: ResourceLocation? = null,

    val title: String = "",
    val text: String = "",
) : Page("patchouli:smelting")