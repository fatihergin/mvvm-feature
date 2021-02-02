package com.github.fatihergin.mvvmfeature.services

import com.github.fatihergin.mvvmfeature.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
