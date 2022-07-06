package io.github.edgeatzero.booksource.models

/**
 *  api内实现的Book类
 * */
public data class SBook(
    public override val id: String,
    public override val title: String,
    public override val author: String,
    public override val tags: List<Tag>,
    public override val uploader: String?,
    public override val imageUrl: String?,
    public override val description: String
) : Book()