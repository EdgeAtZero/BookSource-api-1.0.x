package io.github.edgeatzero.booksource.models

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

/**
 *  api内实现的Book类
 * */
public data class SBook(
    public override val id: String = "",
    public override val title: String = "",
    public override val authors: List<String> = emptyList(),
    public override val status: Status = Status.Finished,
    public override val tags: List<Tag> = emptyList(),
    public override val uploader: String? = null,
    public override val imageUrl: String? = null,
    public override val description: String = "",
    public override val lastUpdated: Instant = Clock.System.now()
) : Book()