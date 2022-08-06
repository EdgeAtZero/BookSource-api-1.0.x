package io.github.edgeatzero.booksource.preferences

import io.github.edgeatzero.booksource.ExperimentalBookSourceApi

/**
 *  用来标识选项的接口
 * */
@ExperimentalBookSourceApi
public interface Preference {

    /**
     *  ID
     * */
    public val id: String?

}

@ExperimentalBookSourceApi
public typealias Preferences = List<Preference>
