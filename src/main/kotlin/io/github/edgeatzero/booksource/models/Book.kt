package io.github.edgeatzero.booksource.models

import kotlinx.datetime.Instant

/**
 *  书籍信息
 * */
public abstract class Book {

    /**
     *  书籍id
     *
     *  必须为唯一id(在该书源下即可)
     * */
    public abstract val id: String

    /**
     *  书籍标题
     * */
    public abstract val title: String

    /**
     *  书籍作者
     * */
    public abstract val authors: List<String>

    /**
     *  书籍状态
     * */
    public abstract val status: Status

    /**
     *  标签
     * */
    public abstract val tags: List<Tag>

    /**
     *  书籍上传者
     * */
    public abstract val uploader: String?

    /**
     *  封面链接
     * */
    public abstract val imageUrl: String?

    /**
     *  描述
     * */
    public abstract val description: String

    /**
     *  上次更新时间
     * */
    public abstract val lastUpdated: Instant?

    /**
     *  书籍状态
     * */
    enum class Status {

        /**
         *  连载中
         * */
        Ongoing,

        /**
         *  完结了
         * */
        Finished;

    }

    public override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Book) return false

        if (id != other.id) return false
        if (title != other.title) return false
        if (authors != other.authors) return false
        if (status != other.status) return false
        if (tags != other.tags) return false
        if (uploader != other.uploader) return false
        if (imageUrl != other.imageUrl) return false
        if (description != other.description) return false
        if (lastUpdated != other.lastUpdated) return false

        return true
    }

    public override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + authors.hashCode()
        result = 31 * result + status.hashCode()
        result = 31 * result + tags.hashCode()
        result = 31 * result + (uploader?.hashCode() ?: 0)
        result = 31 * result + (imageUrl?.hashCode() ?: 0)
        result = 31 * result + description.hashCode()
        result = 31 * result + lastUpdated.hashCode()
        return result
    }

    public override fun toString(): String {
        return "Book(id='$id', title='$title', authors=$authors, status=$status, tags=$tags, uploader=$uploader, imageUrl=$imageUrl, description='$description', lastUpdated=$lastUpdated)"
    }

}