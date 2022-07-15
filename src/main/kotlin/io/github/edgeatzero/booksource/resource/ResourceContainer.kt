package io.github.edgeatzero.booksource.resource

import java.io.Closeable


/**
 *  资源的宿主
 * */
public interface ResourceContainer {

    /**
     *  移除已经关闭了的资源
     * */
    public fun removeClose(resource: Closeable)

    /**
     *  自动关闭资源
     * */
    public fun withClose(resource: Closeable)

}