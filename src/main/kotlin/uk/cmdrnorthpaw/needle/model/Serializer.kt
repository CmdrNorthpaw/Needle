package uk.cmdrnorthpaw.needle.model

import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializer
import com.google.gson.JsonSerializer
import kotlin.reflect.KClass

internal interface Serializer<T> : JsonSerializer<T>, JsonDeserializer<T>

internal fun <T : Any> GsonBuilder.registerTypeAdapter(klass: KClass<T>, serializer: Serializer<T>) {
    registerTypeAdapter(klass.java, serializer)
}