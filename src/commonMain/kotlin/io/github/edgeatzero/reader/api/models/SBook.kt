package io.github.edgeatzero.reader.api.models

/**
 *  api内实现的Book类
 * */
data class SBook(
    override val id: String,
    override val title: String,
    override val author: String,
    override val tags: List<Tag>,
    override val uploader: String?,
    override val imageUrl: String?,
    override val description: String
) : Book()