package uk.cmdrnorthpaw.needle

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import uk.cmdrnorthpaw.needle.resources.Colour
import uk.cmdrnorthpaw.needle.resources.ResourceLocation

data  class Book(
    val name: String,
    @SerialName("landing_text") val landingText: String,

    @SerialName("book_texture") val bookTexture: String,
    @SerialName("filler_texture") val fillerTexture: ResourceLocation = ResourceLocation.EMPTY,
    @SerialName("crafting_texture") val craftingTexture: ResourceLocation = ResourceLocation.EMPTY,

    @SerialName("text_color") val textColour: Colour = Colour(0x000000),
    @SerialName("header_color") val headerColour: Colour = Colour(0x333333),
    @SerialName("nameplate_color") val namePlateColour: Colour = Colour(0xFFDD00),
    @SerialName("link_color") val linkColour: Colour = Colour(0x0000EE),
    @SerialName("link_hover_color") val linkHoverColour: Colour = Colour(0x8800EE),
    @SerialName("progress_bar_colour") val progressBarColour: Colour = Colour(0xFFFF55),
    @SerialName("progress_bar_background") val progressBatBackgroundColour: Colour = Colour(0xDDDDDD),

    @SerialName("open_sound") val openingSound: ResourceLocation = ResourceLocation.EMPTY,
    @SerialName("flip_sound") val pageFlipSound: ResourceLocation = ResourceLocation.EMPTY,
    @SerialName("index_icon") val resourceLocation: ResourceLocation = ResourceLocation.EMPTY,

    @SerialName("show_progress") val showProgress: Boolean = true,
    val version: String = "0",
    @SerialName("creative_tab") val creativeTab: String = "misc",
    @SerialName("dont_generate_book") val `don'tGenerateBook`: Boolean = false,
    @SerialName("custom_book_item") val bookItem: ResourceLocation = ResourceLocation.EMPTY,
    @SerialName("show_toasts") val showToasts: Boolean = true,
    @SerialName("use_blocky_font") val useBlockyFonts: Boolean = true,
    @SerialName("i18n") val useI18n: Boolean = true,
    @SerialName("pause_game") val pauseGame: Boolean = false
)