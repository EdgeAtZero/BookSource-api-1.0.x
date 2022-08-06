package io.github.edgeatzero.booksource.preferences


/**
 *  动作处理器的容器
 * */
public interface PreferenceActionContainer<R : Preference> {
    /**
     *  动作处理器
     * */
    public val action: PreferenceAction<R>
}