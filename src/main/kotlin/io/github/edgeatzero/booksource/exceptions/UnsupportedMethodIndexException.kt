package io.github.edgeatzero.booksource.exceptions

/**
 *  不支持的方法索引
 * */
class UnsupportedMethodIndexException : IndexOutOfBoundsException {
    constructor(index: Int) : super(index)
    constructor(cause: String) : super(cause)
}