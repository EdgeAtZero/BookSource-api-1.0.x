package io.github.edgeatzero.reader.api.preferences

import io.github.edgeatzero.reader.api.preferences.PreferenceInput.InputType

public fun Preference.Group<in PreferenceInput>.input(
    id: String,
    text: String = "",
    label: String = "",
    type: InputType = InputType.Default
) = addPreference(PreferenceInput(id, text, label, type))

public fun Preference.Group<in PreferenceSwitch>.switch(
    id: String,
    isChecked: Boolean = false,
    label: String
) = addPreference(PreferenceSwitch(id, isChecked, label))

public fun Preference.Group<in PreferenceCategory>.category(
    label: String = "",
    action: PreferenceCategory.() -> Unit
) = addPreference(PreferenceCategory(label).also(action))

public fun Preference.Group<in PreferenceText>.text(
    text: String,
    title: String? = null,
    copyable: Boolean = false
) = addPreference(PreferenceText(title, text, copyable))
