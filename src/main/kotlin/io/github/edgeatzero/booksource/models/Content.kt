package io.github.edgeatzero.booksource.models

public typealias Contents = List<Content>

/**
 *  内容
 * */
public sealed interface Content {

    /**
     *  一段文字
     * */
    public data class Line(public val value: String) : Content

    /**
     *  一张图片
     * */
    public data class URL(public val value: String) : Content

}