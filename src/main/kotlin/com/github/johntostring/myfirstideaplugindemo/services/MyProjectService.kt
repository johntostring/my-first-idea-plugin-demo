package com.github.johntostring.myfirstideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.johntostring.myfirstideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
