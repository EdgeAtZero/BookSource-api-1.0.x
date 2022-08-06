package io.github.edgeatzero.booksource.preferences

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi

/**
 *  输入框选项
 * */
@ExperimentalBookSourceApi
public data class InputPreference(
    /**
     *  ID
     * */
    public override val id: String,
    /**
     *  是否启用
     * */
    public var enabled: Boolean = true,
    /**
     *  标签
     * */
    public val label: String? = null,
    /**
     *  输入类型
     * */
    public val type: Type = Type.Text,
    /**
     *  输入内容
     * */
    public val input: String? = null,
    /**
     *  单行
     * */
    public val single: Boolean = false,
    /**
     *  动作处理器
     * */
    public override val action: PreferenceAction<SelectPreference> = PreferenceAction.empty()
) : Preference, PreferenceActionContainer {
    public enum class Type {
        /**
         *  普通文本
         * */
        Text,

        /**
         *  密码
         * */
        Password,

        /**
         *  数字
         * */
        Number;
    }
}