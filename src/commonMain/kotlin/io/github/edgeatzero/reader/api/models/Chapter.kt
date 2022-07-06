package io.github.edgeatzero.reader.api.models

/**
 *  章节信息
 * */
public abstract class Chapter {

    /**
     *  章节的id
     *
     *  必须为唯一id(在该书籍下即可)
     * */
    public abstract val id: String

    /**
     *  章节名称
     * */
    public abstract val name: String

    /**
     *  描述
     * */
    public abstract val description: String?

    public override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Chapter) return false

        if (id != other.id) return false
        if (name != other.name) return false
        if (description != other.description) return false

        return true
    }

    public override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + (description?.hashCode() ?: 0)
        return result
    }

}