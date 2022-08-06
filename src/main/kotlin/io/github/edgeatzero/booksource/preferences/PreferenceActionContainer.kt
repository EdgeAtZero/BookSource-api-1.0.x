package io.github.edgeatzero.booksource.preferences

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi

/**
 *  动作处理器的容器
 * */
@ExperimentalBookSourceApi
public interface PreferenceActionContainer<R : Preference> {
    /**
     *  动作处理器
     * */
    public val action: PreferenceAction<R>
}