package io.github.edgeatzero.booksource.functions

import io.ktor.client.statement.*

/**
 *  网络图片处理
 * */
public interface ImageURLFunction {

    public suspend fun mapImageUrl(url: String): HttpResponse

}