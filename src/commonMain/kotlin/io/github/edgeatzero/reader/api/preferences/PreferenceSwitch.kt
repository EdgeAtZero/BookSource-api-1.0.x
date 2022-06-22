package io.github.edgeatzero.reader.api.preferences

public class PreferenceSwitch(
    public override val id: String,
    public val isChecked: Boolean,
    public val label: String
) : Preference.Data<PreferenceSwitch.Mutable> {

    override fun mutable(input: Map<String, Any>?) = Mutable(input)

    public inner class Mutable internal constructor(input: Map<String, Any>?) : Preference.Data.Mutable {

        public var isChecked: Boolean = input?.get(id) as? Boolean ?: this@PreferenceSwitch.isChecked

        public override fun write(output: MutableMap<String, Any>) {
            output[id] = isChecked
        }

    }

}