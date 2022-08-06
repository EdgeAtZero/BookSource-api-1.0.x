package io.github.edgeatzero.booksource.functions

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi
import io.github.edgeatzero.booksource.models.Book
import io.github.edgeatzero.booksource.models.SearchSort
import io.github.edgeatzero.booksource.models.TagSearched
import io.github.edgeatzero.booksource.preferences.Preferences
import java.io.IOException

/**
 *  搜索功能
 * */
@ExperimentalBookSourceApi
public interface SearchFunction {

    /**
     *  搜索参数构建器
     * */
    public val searchCreator: Configurer?

    /**
     *  搜索参数配置
     * */
    public val searchPreferences: Preferences

    /**
     *  搜索
     *
     *  @param config 搜索选项
     *
     * */
    @Throws(IllegalArgumentException::class, IOException::class)
    public suspend fun search(config: Map<String, String>): Pair<List<Book>, Map<String, String>?>

    /**
     *  为实现搜索参数的构建的接口
     * */
    public interface Configurer {

        /**
         *  构建参数
         *
         *  @param keywords 关键字
         *  @param tags 标签
         *  @param sort 排序
         *  @param author 作者
         *  @param uploader 上传者
         *
         * */
        @Throws(IllegalArgumentException::class)
        public fun config(
            output: MutableMap<String, String>,
            keywords: String? = null,
            tags: List<TagSearched>? = null,
            sort: SearchSort? = null,
            author: String? = null,
            uploader: String? = null
        )

        /**
         *  设置索引
         * */
        public fun setIndex(configs: MutableMap<String, String>, index: Int)

        /**
         *  获取索引
         * */
        public fun getIndex(configs: Map<String, String>): Int

        /**
         *  设置最大索引
         * */
        public fun getLastIndex(configs: Map<String, String>): Int

        /**
         *  是否支持通过关键字来搜索
         * */
        public val isKeywordsSupported: Boolean

        /**
         *  是否支持通过标签来搜索
         * */
        public val isTagsSupported: Boolean

        /**
         *  是否支持搜索排序
         * */
        public val isSearchOrderSupported: Boolean

        /**
         *  是否支持通过作者来搜索
         * */
        public val isAuthorSupported: Boolean

        /**
         *  是否支持通过上传者来搜索
         * */
        public val isUploaderSupported: Boolean

        /**
         *  页面切换支持索引
         * */
        public val isPageIndexSupported: Boolean

        /**
         *  支持的搜索排序
         * */
        public val supportedSearchSorts: List<SearchSort>

    }

}