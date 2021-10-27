package uk.cmdrnorthpaw.needle.book

import com.google.gson.annotations.SerializedName
import uk.cmdrnorthpaw.needle.book.page.Page
import uk.cmdrnorthpaw.needle.resources.ResourceLocation

class Entry(
    val name: String,
    val categotry: String,
    val icon: ResourceLocation,
    val pages: List<Page>,

    val advancement: String = "",
    val flag: String = "", //TODO
    @SerializedName("turnin") val turnInAdvancement: String = "",

    @SerializedName("priority") val hasPriority: Boolean = false,
    @SerializedName("secret") val isSecret: Boolean = false,
    @SerializedName("sortnum") val sortingNumber: Int = 0,

    @SerializedName("extra_recipe_mappings") val extraRecipeMappings: Map<String, Int> = emptyMap()

)