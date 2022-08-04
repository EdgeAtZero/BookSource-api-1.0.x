package io.github.edgeatzero.booksource.nesteds

import io.github.edgeatzero.booksource.exceptions.InstallException
import io.github.edgeatzero.booksource.utils.ConfigureHelper

/**
 *  偏好耦合
 *
 *  @see ConfigureHelper
 * */
public interface ConfigureNested {

    @Throws(InstallException::class)
    public fun install(configure: Map<String, String>, helper: ConfigureHelper)

}