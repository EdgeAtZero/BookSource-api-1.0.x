package io.github.edgeatzero.booksource.nesteds

import io.github.edgeatzero.booksource.utils.LogHelper

/**
 *  日志耦合
 *
 *  @see LogHelper
 * */
public interface LogNested {

    @Throws(RuntimeException::class)
    public fun install(helper: LogHelper)

}