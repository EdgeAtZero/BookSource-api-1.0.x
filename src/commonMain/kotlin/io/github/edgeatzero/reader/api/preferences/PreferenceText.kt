package io.github.edgeatzero.reader.api.preferences

public class PreferenceText(
    public val title: String?,
    public val text: String,
    public val copyable: Boolean
) : Preference.UI {
    public override val id: String? = null
}