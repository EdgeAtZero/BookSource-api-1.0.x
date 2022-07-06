package io.github.edgeatzero.booksource.preferences

/**
 *  输入框选项
 * */
public data class InputPreference(
    /**
     *  标签
     * */
    public val label: String? = null,
    /**
     *  输入类型
     * */
    public val type: Type = Type.Text,
    /**
     *  默认输入内容
     * */
    public val placement: String? = null,
    /**
     *  单行
     * */
    public val single: Boolean = false,
    public val action: InputPreference.(input: String, output: MutableMap<String, Any>) -> Unit = { _, _ -> }
) : Preference {
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