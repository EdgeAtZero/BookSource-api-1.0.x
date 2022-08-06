package io.github.edgeatzero.booksource.preferences

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi

/**
 *  勾选选项
 * */
@ExperimentalBookSourceApi
public data class SelectPreference(
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
    public val selected: String? = null,
    /**
     *  动作处理器
     * */
    public override val action: PreferenceAction<SelectPreference> = PreferenceAction.empty()
) : Preference, PreferenceActionContainer