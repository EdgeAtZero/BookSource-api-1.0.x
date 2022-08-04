package io.github.edgeatzero.booksource.models

import org.intellij.lang.annotations.Language

public typealias Contents = List<Content>

/**
 *  内容
 * */
public sealed interface Content {

    /**
     *  一段文字
     * */
    public data class Text(public val text: String) : Content

    /**
     *  一段HTML
     * */
    public data class HtmlText(@Language("HTML") public val html: String) : Content

    /**
     *  一张图片
     * */
    public data class Image(public val url: String) : Content

}