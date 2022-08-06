package io.github.edgeatzero.booksource.preferences


/**
 *  多勾选选项
 * */
public data class MultipleSelectPreference(
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
     *  选项
     * */
    public val selections: List<String>,
    /**
     *  已勾选的选项
     * */
    public val selected: List<String>? = null,
    /**
     *  动作处理器
     * */
    public override val action: PreferenceAction<MultipleSelectPreference> = PreferenceAction.empty()
) : Preference, PreferenceActionContainer<MultipleSelectPreference>