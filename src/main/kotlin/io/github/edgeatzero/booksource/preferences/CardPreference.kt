package io.github.edgeatzero.booksource.preferences

/**
 *  卡片选项
 * */
public data class CardPreference(
    public val preferences: List<Preference>
) : Preference {
    public constructor(vararg preference: Preference) : this(preference.toList())
}