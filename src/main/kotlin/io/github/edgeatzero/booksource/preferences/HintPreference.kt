package io.github.edgeatzero.booksource.preferences


/**
 *  文本提示选项
 * */
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