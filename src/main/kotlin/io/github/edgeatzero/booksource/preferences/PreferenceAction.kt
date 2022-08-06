package io.github.edgeatzero.booksource.preferences


/**
 *  动作处理器
 * */
public data class PreferenceAction<T : Preference>(
    public val saver: (output: MutableMap<String, String>, present: T) -> Unit,
    public val restorer: (input: Map<String, String>, previous: T) -> T
) {

    companion object {

        /**
         *  创建空的动作处理器
         * */
        @JvmStatic
        public fun <T : Preference> empty() = PreferenceAction<T>(
            saver = { _, _ -> },
            restorer = { _, previous -> previous }
        )
    }

}