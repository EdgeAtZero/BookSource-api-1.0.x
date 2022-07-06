package io.github.edgeatzero.reader.api.exceptions

import io.github.edgeatzero.reader.api.models.Chapter

/**
 *  找不到章节
 * */
public class NoSuchChapterException(chapter: Chapter) : IllegalArgumentException("no such chapter ${chapter.id}!")