package io.github.edgeatzero.booksource.preferences

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi

/**
 *  开关选项
 * */
@ExperimentalBookSourceApi
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
    public override val action: PreferenceAction<SelectPreference> = PreferenceAction.empty()
) : Preference, PreferenceActionContainer