package io.github.edgeatzero.booksource.functions

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi
import io.github.edgeatzero.booksource.preferences.Preferences

/**
 *  配置功能
 * */
@ExperimentalBookSourceApi
public interface ConfigureFunction {

    /**
     *  配置选项
     * */
    public val configPreference: Preferences

    /**
     *  配置
     * */
    public var configure: Map<String, Any>

}