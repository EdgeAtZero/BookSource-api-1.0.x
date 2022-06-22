package io.github.edgeatzero.reader.api.nesteds

import io.github.edgeatzero.reader.api.utils.LogHelper

/**
 *  日志耦合
 *
 *  @see LogHelper
 * */
public interface LogNested {

    public fun install(logger: LogHelper)

}