package uk.cmdrnorthpaw.needle.book.page


abstract class Page(
    val type: String,
    val advancement: String = "",
    val flag: String = "",
    val anchor: String = "",
)