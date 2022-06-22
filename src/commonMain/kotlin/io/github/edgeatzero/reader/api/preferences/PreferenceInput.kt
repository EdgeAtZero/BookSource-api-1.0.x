package io.github.edgeatzero.reader.api.preferences

public class PreferenceInput(
    public override val id: String,
    public val text: String,
    public val label: String,
    public val type: InputType
) : Preference.Data<PreferenceInput.Mutable> {

    override fun mutable(input: Map<String, Any>?) = Mutable(input)

    public inner class Mutable internal constructor(input: Map<String, Any>?) : Preference.Data.Mutable {

        public var text: String = input?.get(id) as? String ?: this@PreferenceInput.text

        public override fun write(output: MutableMap<String, Any>) {
            output[id] = text
        }

    }

    public enum class InputType { Default, Numbers, Password }

}