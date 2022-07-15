package io.github.edgeatzero.booksource.extends

import io.github.edgeatzero.booksource.BookSource
import io.github.edgeatzero.booksource.functions.ImageURLFunction
import io.github.edgeatzero.booksource.nesteds.HttpClientEngineNested
import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.request.*

public abstract class NetworkBookSource : BookSource(), ImageURLFunction, HttpClientEngineNested {
    protected open lateinit var client: HttpClient

    public override fun install() = Unit

    public override fun install(engine: HttpClientEngine) {
        client = HttpClient(engine) { clientConfig() }
    }

    public open fun HttpClientConfig<*>.clientConfig() = Unit

    public abstract fun HttpRequestBuilder.processImageURL(url: String)

    public override suspend fun mapImageUrl(url: String) = client.get(url) { processImageURL(url) }

    public override fun close() {
        client.close()
    }

}