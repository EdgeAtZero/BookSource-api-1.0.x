package io.github.edgeatzero.booksource.preferences


/**
 *  开关选项
 * */
public data class SwitchPreference(
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
     *  默认状态
     * */
    public val placement: String? = null,
    /**
     *  动作处理器
     * */
    public override val action: PreferenceAction<SwitchPreference> = PreferenceAction.empty()
) : Preference, PreferenceActionContainer<SwitchPreference>