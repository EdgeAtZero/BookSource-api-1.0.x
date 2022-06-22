package io.github.edgeatzero.reader.api.utils

/**
 *  日志辅助接口
 * */
public interface LogHelper {

    public fun error(message: String)

    public fun error(message: String, cause: Throwable)

    public fun warn(message: String)

    public fun warn(message: String, cause: Throwable)

    public fun info(message: String)

    public fun info(message: String, cause: Throwable)

    public fun debug(message: String)

    public fun debug(message: String, cause: Throwable)

    public fun trace(message: String)

    public fun trace(message: String, cause: Throwable)

}