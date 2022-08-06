package io.github.edgeatzero.booksource.extends

import io.github.edgeatzero.booksource.BookSource
import io.github.edgeatzero.booksource.functions.ImageURLFunction
import io.github.edgeatzero.booksource.nesteds.HttpClientEngineNested
import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.request.*

/**
 *  网络书源
 * */
public abstract class NetworkBookSource : BookSource(), ImageURLFunction, HttpClientEngineNested {

    /**
     *  [HttpClient] 实例
     * */
    protected open lateinit var client: HttpClient

    /**
     *  @see BookSource.install
     * */
    public override fun install() = Unit

    /**
     *  @see HttpClientEngineNested.install
     * */
    public override fun install(engine: HttpClientEngine) {
        client = HttpClient(engine) { clientConfig() }
    }

    /**
     *  配置  [client]
     * */
    public open fun HttpClientConfig<*>.clientConfig() = Unit

    /**
     *  @see mapImageUrl
     * */
    public abstract fun HttpRequestBuilder.processImageURL(url: String)

    /**
     *  @see ImageURLFunction.mapImageUrl
     * */
    public override suspend fun mapImageUrl(url: String) = client.get(url) { processImageURL(url) }

    /**
     *  @see BookSource.close
     * */
    public override fun close() { client.close() }

}