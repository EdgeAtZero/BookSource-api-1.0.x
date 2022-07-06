package io.github.edgeatzero.booksource.models

/**
 *  api内实现的Chapter类
 * */
public data class SChapter(
    public override val id: String,
    public override val name: String,
    public override val description: String?
) : Chapter()