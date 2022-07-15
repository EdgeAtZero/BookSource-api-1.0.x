package io.github.edgeatzero.booksource.models

import kotlinx.datetime.Instant

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

    /**
     *  上次更新时间
     * */
    public abstract val lastUpdated: Instant

    public override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Chapter) return false

        if (id != other.id) return false
        if (name != other.name) return false
        if (lastUpdated != other.lastUpdated) return false
        if (description != other.description) return false

        return true
    }

    public override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + lastUpdated.hashCode()
        result = 31 * result + (description?.hashCode() ?: 0)
        return result
    }

}