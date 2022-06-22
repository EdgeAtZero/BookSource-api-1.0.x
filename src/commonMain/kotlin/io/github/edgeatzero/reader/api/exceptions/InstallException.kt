package io.github.edgeatzero.reader.api.exceptions

/**
 *  安装时期出现错误
 * */
public class InstallException : RuntimeException {
    public constructor(message: String) : super(message)
    public constructor(cause: Throwable) : super(cause)
}