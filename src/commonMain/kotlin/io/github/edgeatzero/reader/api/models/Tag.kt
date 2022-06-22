package io.github.edgeatzero.reader.api.models

/**
 *  书籍标签
 * */
public abstract class Tag {

    /**
     *  标签名称
     * */
    public abstract val name: String

    public override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tag) return false

        if (name != other.name) return false

        return true
    }

    public override fun hashCode(): Int {
        return name.hashCode()
    }

}