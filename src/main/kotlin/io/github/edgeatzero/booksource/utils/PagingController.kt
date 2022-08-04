package io.github.edgeatzero.booksource.utils

import java.io.Closeable
import java.io.IOException
import java.util.function.Consumer

public abstract class PagingController<T : Any> : Closeable {

    public var isFinished: Boolean = false
        protected set

    public abstract suspend fun fetch(): T

    public abstract fun nextPage()

    public abstract fun previousPage()

    /**
     *  关闭占用资源
     * */
    @Throws(IOException::class)
    public override fun close() = Unit

}