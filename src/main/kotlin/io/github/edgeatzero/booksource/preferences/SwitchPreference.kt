package io.github.edgeatzero.booksource.preferences

/**
 *  开关选项
 * */
public data class SwitchPreference(
    /**
     *  标签
     * */
    public val label: String? = null,
    /**
     *  默认状态
     * */
    public val placement: String? = null,
    public val action: InputPreference.(input: String, output: MutableMap<String, Any>) -> Unit = { _, _ -> }
) : Preference