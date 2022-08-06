package io.github.edgeatzero.booksource.functions

import java.util.Locale

/**
 *  本地化功能
 * */
public interface LocalizationFunction {

    /**
     *  当前的语言
     * */
    public val lang: Locale

    /**
     *  支持的语言
     * */
    public val supportedLang: Array<Locale>

    /**
     *  初始化或语言更改时触发
     * */
    public fun install(lang: Locale)

}