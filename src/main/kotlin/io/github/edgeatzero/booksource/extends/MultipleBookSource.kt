package io.github.edgeatzero.booksource.extends

import io.github.edgeatzero.booksource.functions.MultipleMethodFunction
import io.github.edgeatzero.booksource.models.Book
import io.github.edgeatzero.booksource.models.Chapter
import io.github.edgeatzero.booksource.models.Contents

/**
 *  拥有多个方式获取书的书源
 *
 *  @see MultipleMethodFunction
 * */
public abstract class MultipleBookSource : NetworkBookSource(), MultipleMethodFunction {

    /**
     *  @see MultipleMethodFunction.maxFetchMethodIndex
     * */
    public override val maxFetchMethodIndex = 0

    /**
     *  @see MultipleMethodFunction.maxChaptersMethodIndex
     * */
    public override val maxChaptersMethodIndex = 0

    /**
     *  @see MultipleMethodFunction.maxContentsMethodIndex
     * */
    public override val maxContentsMethodIndex = 0

    /**
     *  @see MultipleMethodFunction.fetch
     * */
    public override suspend fun fetch(id: String): Book = fetch(id, method = 0)

    /**
     *  @see MultipleMethodFunction.chapters
     * */
    public override suspend fun chapters(book: Book): List<Chapter> = chapters(book, method = 0)

    /**
     *  @see MultipleMethodFunction.contents
     * */
    public override suspend fun contents(book: Book, chapter: Chapter): Contents = contents(book, chapter, method = 0)

}