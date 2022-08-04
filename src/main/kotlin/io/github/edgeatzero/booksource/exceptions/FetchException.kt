package io.github.edgeatzero.booksource.exceptions

/**
 *  获取时出现错误
 * */
public class FetchException @JvmOverloads constructor(
    message: String? = null,
    cause: Throwable? = null
) : IllegalArgumentException(message, cause)