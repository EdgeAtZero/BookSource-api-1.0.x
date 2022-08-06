package io.github.edgeatzero.booksource.preferences


/**
 *  用来标识选项的接口
 * */
public interface Preference {

    /**
     *  ID
     * */
    public val id: String

}

public typealias Preferences = List<Preference>