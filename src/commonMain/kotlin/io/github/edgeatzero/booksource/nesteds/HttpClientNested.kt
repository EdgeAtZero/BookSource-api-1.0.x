package io.github.edgeatzero.booksource.nesteds

import io.ktor.client.HttpClient

/**
 *  HttpClient耦合
 *
 *  @see HttpClient
 * */
public interface HttpClientNested {

    @Throws(RuntimeException::class)
    public fun install(client: HttpClient)

}