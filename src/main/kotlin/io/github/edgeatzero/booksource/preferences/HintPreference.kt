package io.github.edgeatzero.booksource.preferences

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi

/**
 *  文本提示选项
 * */
@ExperimentalBookSourceApi
public data class HintPreference(
    /**
     *  ID
     * */
    public override val id: String,
    /**
     *  内容
     * */
    public val content: String
) : Preference