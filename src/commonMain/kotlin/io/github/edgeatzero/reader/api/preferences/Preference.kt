package io.github.edgeatzero.reader.api.preferences

import kotlin.jvm.JvmOverloads

public sealed interface Preference {

    public abstract val id: String?

    public interface UI : Preference

    public abstract class Group<T : Preference>(preferences: List<T>) : UI {

        public override val id: String? = null

        protected open val mPreferences: MutableList<T> = preferences.toMutableList()
        val preferences: List<T>
            get() = mPreferences.toList()

        public fun addPreference(preference: T) {
            if (!checkExist(preference.id)) mPreferences.add(preference)
        }

        public fun removePreference(preference: T) {
            mPreferences.add(preference)
        }

        public fun removeAllPreference() {
            mPreferences.clear()
        }

        public fun checkExist(id: String?) = id != null && mPreferences.any { it.id == id }

        public class Impl<T : Preference> public @JvmOverloads constructor(
            preferences: List<T> = emptyList()
        ) : Group<T>(preferences)

    }

    public interface Data<T : Data.Mutable> : UI {

        public abstract override val id: String

        public abstract fun mutable(input: Map<String, Any>? = null): T

        public interface Mutable {

            public open fun write(output: MutableMap<String, Any>) = Unit

        }

    }

}