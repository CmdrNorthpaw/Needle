package uk.cmdrnorthpaw.needle.book

import kotlinx.serialization.SerialName
import uk.cmdrnorthpaw.needle.resources.ResourceLocation

class Entry(
    val name: String,
    val categotry: String,
    val icon: ResourceLocation,

    val advancement: String = "",
    val flag: String = "", //TODO
    @SerialName("turnin") val turnInAdvancement: String = "",

    @SerialName("priority") val hasPriority: Boolean = false,
    @SerialName("secret") val isSecret: Boolean = false,
    @SerialName("sortnum") val sortingNumber: Int = 0,

    @SerialName("extra_recipe_mappings") val extraRecipeMappings: Map<String, Int> = emptyMap()

)