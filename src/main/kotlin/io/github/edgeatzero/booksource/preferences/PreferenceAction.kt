package io.github.edgeatzero.booksource.preferences

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi

@ExperimentalBookSourceApi
public data class PreferenceAction<T : Preference>(
    public val saver: (input: MutableMap<String, String>, previous: T) -> T,
    public val restorer: (input: Map<String, String>, previous: T) -> T
) {
    companion object {
        @JvmStatic
        public fun <T : Preference> empty() = PreferenceAction<T>(
            saver = { _, previous -> previous },
            restorer = { _, previous -> previous }
        )
    }
}