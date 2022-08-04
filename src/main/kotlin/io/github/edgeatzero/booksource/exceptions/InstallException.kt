package io.github.edgeatzero.booksource.exceptions

/**
 *  安装时出现错误
 * */
public class InstallException @JvmOverloads constructor(
    message: String? = null,
    cause: Throwable? = null
) : RuntimeException(message, cause)