package io.github.edgeatzero.reader.api.nesteds

import io.ktor.client.*

/**
 *  HttpClient耦合
 *
 *  @see HttpClient
 * */
public interface HttpClientNested {

    public fun install(client: HttpClient)

}