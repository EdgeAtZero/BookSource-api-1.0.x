package io.github.edgeatzero.reader.api.models

/**
 *  api内实现的Chapter类
 * */
data class SChapter(
    override val id: String,
    override val name: String,
    override val description: String?
) : Chapter()