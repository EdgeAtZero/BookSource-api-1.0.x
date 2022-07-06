package io.github.edgeatzero.reader.api

import io.github.edgeatzero.reader.api.exceptions.InstallException
import io.github.edgeatzero.reader.api.exceptions.NoSuchBookException
import io.github.edgeatzero.reader.api.exceptions.NoSuchChapterException
import io.github.edgeatzero.reader.api.models.Book
import io.github.edgeatzero.reader.api.models.Chapter
import io.github.edgeatzero.reader.api.models.Content

/**
 *  书源抽象类
 *
 *  继承此接口以实现书源功能
 * */
public abstract class BookSource {

    /**
     *  初始化
     * */
    @Throws(InstallException::class)
    public abstract fun install()

    /**
     *  通过书籍id获取书籍的信息
     * */
    @Throws(NoSuchBookException::class)
    public abstract suspend fun fetch(id: String): Book

    /**
     *  更新小说信息
     * */
    @Throws(NoSuchBookException::class)
    public abstract suspend fun update(book: Book): Book

    /**
     * 获取书籍的章节
     * */
    @Throws(NoSuchBookException::class)
    public abstract suspend fun chapters(book: Book): List<Chapter>

    /**
     * 章节的文本内容
     * */
    @Throws(NoSuchChapterException::class)
    public abstract suspend fun contents(chapter: Chapter): List<Content>

}