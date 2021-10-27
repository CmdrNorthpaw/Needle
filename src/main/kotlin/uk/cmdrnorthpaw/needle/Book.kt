package uk.cmdrnorthpaw.needle

import com.google.gson.annotations.SerializedName
import uk.cmdrnorthpaw.needle.resources.Colour
import uk.cmdrnorthpaw.needle.resources.ResourceLocation

data  class Book(
    val name: String,
    @SerializedName("landing_text") val landingText: String,

    @SerializedName("book_texture") val bookTexture: String,
    @SerializedName("filler_texture") val fillerTexture: ResourceLocation? = null,
    @SerializedName("crafting_texture") val craftingTexture: ResourceLocation? = null,

    @SerializedName("text_color") val textColour: Colour = Colour(0x000000),
    @SerializedName("header_color") val headerColour: Colour = Colour(0x333333),
    @SerializedName("nameplate_color") val namePlateColour: Colour = Colour(0xFFDD00),
    @SerializedName("link_color") val linkColour: Colour = Colour(0x0000EE),
    @SerializedName("link_hover_color") val linkHoverColour: Colour = Colour(0x8800EE),
    @SerializedName("progress_bar_colour") val progressBarColour: Colour = Colour(0xFFFF55),
    @SerializedName("progress_bar_background") val progressBatBackgroundColour: Colour = Colour(0xDDDDDD),

    @SerializedName("open_sound") val openingSound: ResourceLocation? = null,
    @SerializedName("flip_sound") val pageFlipSound: ResourceLocation? = null,
    @SerializedName("index_icon") val resourceLocation: ResourceLocation? = null,

    @SerializedName("show_progress") val showProgress: Boolean = true,
    val version: String = "0",
    @SerializedName("creative_tab") val creativeTab: String = "misc",
    @SerializedName("dont_generate_book") val `don'tGenerateBook`: Boolean = false,
    @SerializedName("custom_book_item") val bookItem: ResourceLocation? = null,
    @SerializedName("show_toasts") val showToasts: Boolean = true,
    @SerializedName("use_blocky_font") val useBlockyFonts: Boolean = true,
    @SerializedName("i18n") val useI18n: Boolean = true,
    @SerializedName("pause_game") val pauseGame: Boolean = false
)