package com.github.lishali12345.intellijplaygroundplugin.services

import com.intellij.openapi.project.Project
import com.github.lishali12345.intellijplaygroundplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
