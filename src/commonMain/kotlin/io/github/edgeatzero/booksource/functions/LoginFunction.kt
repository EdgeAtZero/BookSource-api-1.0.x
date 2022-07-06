package io.github.edgeatzero.booksource.functions

import io.github.edgeatzero.booksource.preferences.Preference
import java.io.IOException

/**
 *  登录实现类
 * */
public interface LoginFunction {

    /**
     *  登录类型
     * */
    public val loginType: Type

    /**
     *  登录参数配置
     * */
    public val loginPreferences: List<Preference>

    /**
     *  登录
     * */
    @Throws(IllegalArgumentException::class,IOException::class)
    public suspend fun login(configs: Map<String, Any>)

    /**
     *  登出
     * */
    @Throws(IOException::class)
    public suspend fun logout()

    /**
     *  登录类型
     * */
    enum class Type {
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