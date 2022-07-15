package io.github.edgeatzero.booksource.models

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

/**
 *  api内实现的Chapter类
 * */
public data class SChapter(
    public override val id: String = "",
    public override val name: String = "",
    public override val description: String? = null,
    public override val lastUpdated: Instant = Clock.System.now()
) : Chapter()