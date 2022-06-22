package io.github.edgeatzero.reader.api.preferences

/**
 *  类别
 * */
public class PreferenceCategory(
    public val label: String,
    preferences: List<Preference> = emptyList()
) : Preference.Group<Preference>(preferences)