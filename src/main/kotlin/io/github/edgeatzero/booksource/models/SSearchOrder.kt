package io.github.edgeatzero.booksource.models

/**
 *  搜索排序
 * */
public enum class SSearchOrder: SearchOrder {

    /**
     *  最新
     * */
    Newest,

    /**
     *  最旧
     * */
    Oldest,

    /**
     *  最热门
     * */
    Hottest,

    /**
     *  近期热门
     * */
    HottestRecently;

}