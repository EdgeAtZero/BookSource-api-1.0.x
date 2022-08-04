package io.github.edgeatzero.booksource.exceptions

/**
 *  网络错误
 * */
public class NetworkException @JvmOverloads constructor(
    message: String? = null,
    cause: Throwable? = null
) : IllegalArgumentException(message, cause)