package uk.cmdrnorthpaw.needle.book.page

import kotlinx.serialization.Required
import kotlinx.serialization.Serializable

@Serializable
abstract class Page(
    @Required val type: String,
    val advancement: String = "",
    val flag: String = "",
    val anchor: String = "",
)