package io.github.edgeatzero.reader.api.functions

import io.github.edgeatzero.reader.api.models.Book
import io.github.edgeatzero.reader.api.models.SearchOrder
import io.github.edgeatzero.reader.api.models.TagSearched
import io.github.edgeatzero.reader.api.preferences.Preference

/**
 *  搜索功能
 * */
public interface SearchFunction {

    /**
     *  搜索参数构建器
     * */
    public val searchCreator: ConfigCreator?

    /**
     *  搜索参数配置
     * */
    public val searchPreferences: List<Preference>

    /**
     *  搜索
     *
     *  @param configs 搜索选项
     *
     * */
    public suspend fun search(configs: Map<String, Any>): List<Book>


    /**
     *  为实现搜索参数的构建的接口
     * */
    public interface ConfigCreator {

        /**
         *  构建参数
         *
         *  @param keywords 关键字
         *  @param tags 标签
         *  @param order 排序
         *  @param author 作者
         *  @param uploader 上传者
         *
         * */
        public fun buildConfig(
            keywords: String? = null,
            tags: List<TagSearched>? = null,
            order: SearchOrder? = null,
            author: String? = null,
            uploader: String? = null
        )

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

    }

}