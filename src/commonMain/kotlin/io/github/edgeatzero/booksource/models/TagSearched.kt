package io.github.edgeatzero.booksource.models

/**
 *  用于搜索的标签
 * */
public abstract class TagSearched : Tag() {

    /**
     *  @see Tag.name
     * */
    public abstract override val name: String

    /**
     *  是否排除该标签
     * */
    public abstract val exclude: Boolean

    public override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TagSearched) return false
        if (!super.equals(other)) return false

        if (name != other.name) return false
        if (exclude != other.exclude) return false

        return true
    }

    public override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + exclude.hashCode()
        return result
    }

}