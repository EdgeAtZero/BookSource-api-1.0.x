package io.github.edgeatzero.booksource.exceptions

/**
 *  解析书源时出现错误
 * */
public class ParsedException @JvmOverloads constructor(
    message: String? = null,
    cause: Throwable? = null
) : IllegalArgumentException(message, cause)