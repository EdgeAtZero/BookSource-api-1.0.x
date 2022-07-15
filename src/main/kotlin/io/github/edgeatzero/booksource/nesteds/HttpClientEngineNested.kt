package io.github.edgeatzero.booksource.nesteds

import io.ktor.client.HttpClient
import io.ktor.client.engine.*

/**
 *  HttpClient耦合
 *
 *  @see HttpClient
 * */
public interface HttpClientEngineNested {

    @Throws(RuntimeException::class)
    public fun install(engine: HttpClientEngine)

}