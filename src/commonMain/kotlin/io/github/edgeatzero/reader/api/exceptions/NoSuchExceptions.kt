package io.github.edgeatzero.reader.api.exceptions

import io.github.edgeatzero.reader.api.models.Book
import io.github.edgeatzero.reader.api.models.Chapter

/**
 *  找不到书籍
 * */
public class NoSuchBookException(book: Book) : IllegalArgumentException("no such book ${book.id}!")

/**
 *  找不到章节
 * */
public class NoSuchChapterException(chapter: Chapter) : IllegalArgumentException("no such chapter ${chapter.id}!")