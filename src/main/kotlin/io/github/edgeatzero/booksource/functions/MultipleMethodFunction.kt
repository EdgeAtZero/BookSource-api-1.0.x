package io.github.edgeatzero.booksource.functions

import io.github.edgeatzero.booksource.exceptions.FetchException
import io.github.edgeatzero.booksource.models.Book
import io.github.edgeatzero.booksource.models.Chapter
import io.github.edgeatzero.booksource.models.Contents

/**
 *  拓展获取方式
 * */
public interface MultipleMethodFunction {

    /**
     * 最大的 Fetch 方法索引
     * */
    public val maxFetchMethodIndex: Int

    /**
     * 最大的 Chapter 方法索引
     * */
    public val maxChaptersMethodIndex: Int

    /**
     * 最大的 Contents 方法索引
     * */
    public val maxContentsMethodIndex: Int

    /**
     *  通过书籍id获取书籍的信息
     * */
    @Throws(FetchException::class)
    public abstract suspend fun fetch(id: String, method: Int): Book

    /**
     * 获取书籍的章节
     * */
    @Throws(FetchException::class)
    public abstract suspend fun chapters(book: Book, method: Int): List<Chapter>

    /**
     * 章节的文本内容
     * */
    @Throws(FetchException::class)
    public abstract suspend fun contents(book: Book, chapter: Chapter, method: Int): Contents

}