package io.github.edgeatzero.reader.api.nesteds

import io.github.edgeatzero.reader.api.utils.ConfigureHelper

/**
 *  偏好耦合
 *
 *  @see ConfigureHelper
 * */
public interface ConfigureNested {

    public fun install(configure: Map<String, String>, helper: ConfigureHelper)

}