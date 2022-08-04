package io.github.edgeatzero.booksource.extends

import io.github.edgeatzero.booksource.functions.MultipleMethodFunction
import io.github.edgeatzero.booksource.models.Book
import io.github.edgeatzero.booksource.models.Chapter
import io.github.edgeatzero.booksource.models.Contents

public abstract class MultipleBookSource : NetworkBookSource(), MultipleMethodFunction {

    public override val maxFetchMethodIndex = 0
    public override val maxChaptersMethodIndex = 0
    public override val maxContentsMethodIndex = 0

    public override suspend fun fetch(id: String): Book = fetch(id, method = 0)
    public override suspend fun chapters(book: Book): List<Chapter> = chapters(book, method = 0)
    public override suspend fun contents(book: Book, chapter: Chapter): Contents = contents(book, chapter, method = 0)

    public override fun toString(): String = "MultipleBookSource(id='$id', lang=$lang)"

}