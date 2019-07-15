/*
 * Copyright (c) 2017. tangzx(love.tangzx@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tang.intellij.lua.debugger.app

import com.intellij.execution.configurations.ConfigurationType
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.openapi.project.Project
import com.tang.intellij.lua.debugger.LuaConfigurationFactory

/**
 *
 * Created by tangzx on 2017/5/7.
 */
class LuaAppConfigurationFactory(type: ConfigurationType) : LuaConfigurationFactory(type) {

    override fun createTemplateConfiguration(project: Project): RunConfiguration {
        return LuaAppRunConfiguration(project, this)
    }
}
