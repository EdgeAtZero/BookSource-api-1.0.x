package io.github.edgeatzero.booksource.utils

import java.io.IOException


/**
 *  偏好存储辅助接口
 * */
public interface ConfigureHelper {

    public fun save(configure: Map<String, String>)

}