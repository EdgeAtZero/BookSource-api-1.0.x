package io.github.edgeatzero.booksource.preferences

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi

@ExperimentalBookSourceApi
public interface PreferenceActionContainer {
    /**
     *  动作处理器
     * */
    public val action: PreferenceAction<*>
}