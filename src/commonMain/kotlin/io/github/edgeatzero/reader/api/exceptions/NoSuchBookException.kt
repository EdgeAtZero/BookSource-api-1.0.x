package io.github.edgeatzero.reader.api.exceptions

import io.github.edgeatzero.reader.api.models.Book

/**
 *  找不到书籍
 * */
public class NoSuchBookException(book: Book) : IllegalArgumentException("no such book ${book.id}!")