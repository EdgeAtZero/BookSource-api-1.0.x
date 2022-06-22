package io.github.edgeatzero.reader.api.preferences

fun buildPreferences(
    action: Preference.Group<Preference>.() -> Unit
): List<Preference> = Preference.Group.Impl<Preference>().also(action).preferences