package io.github.edgeatzero.booksource.preferences

/**
 *  勾选选项
 * */
public data class SelectPreference(
    /**
     *  标签
     * */
    public val label: String? = null,
    /**
     *  选项
     * */
    public val selections: List<String>,
    /**
     *  默认勾选的选项
     * */
    public val placement: List<String>? = null,
    /**
     *  单选
     * */
    public val single: Boolean = true,
    public val action: SelectPreference.(input: List<String>, output: MutableMap<String, Any>) -> Unit = { _, _ -> }
) : Preference