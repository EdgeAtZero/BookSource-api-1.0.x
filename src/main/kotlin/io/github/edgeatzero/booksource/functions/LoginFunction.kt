package io.github.edgeatzero.booksource.functions

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi
import io.github.edgeatzero.booksource.preferences.Preferences
import java.io.IOException

/**
 *  登录功能
 * */
@ExperimentalBookSourceApi
public interface LoginFunction {

    /**
     *  登录类型
     * */
    public val loginType: Type

    /**
     *  登录参数配置
     * */
    public val loginPreferences: Preferences

    /**
     *  登录
     * */
    @Throws(IllegalArgumentException::class, IOException::class)
    public suspend fun login(configs: Map<String, Any>)

    /**
     *  登出
     * */
    @Throws(IOException::class)
    public suspend fun logout()

    /**
     *  登录类型
     * */
    public enum class Type {

        /**
         *  URL里登录
         * */
        URL,

        /**
         *  已实现方法
         * */
        FUN;

    }

}