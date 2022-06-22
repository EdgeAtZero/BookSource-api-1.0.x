package io.github.edgeatzero.reader.api

/**
 *  书源抽象类
 *
 *  继承此接口以实现书源功能
 * */
public abstract class BookSource {

    /**
     *  初始化
     * */
    @Throws(io.github.edgeatzero.reader.api.exceptions.InstallException::class)
    public abstract fun install()

    /**
     *  通过书籍id获取书籍的信息
     * */
    @Throws(io.github.edgeatzero.reader.api.exceptions.NoSuchBookException::class)
    public abstract suspend fun fetch(id: String): io.github.edgeatzero.reader.api.models.Book

    /**
     *  更新小说信息
     * */
    @Throws(io.github.edgeatzero.reader.api.exceptions.NoSuchBookException::class)
    public abstract suspend fun update(book: io.github.edgeatzero.reader.api.models.Book): io.github.edgeatzero.reader.api.models.Book

    /**
     * 获取书籍的章节
     * */
    @Throws(io.github.edgeatzero.reader.api.exceptions.NoSuchBookException::class)
    public abstract suspend fun chapters(book: io.github.edgeatzero.reader.api.models.Book): List<io.github.edgeatzero.reader.api.models.Chapter>

    /**
     * 章节的文本内容
     * */
    @Throws(io.github.edgeatzero.reader.api.exceptions.NoSuchChapterException::class)
    public abstract suspend fun contents(chapter: io.github.edgeatzero.reader.api.models.Chapter): List<io.github.edgeatzero.reader.api.models.Content>

}