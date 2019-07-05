package org.minifx

import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project

@CompileStatic
class ConditionalReposPlugin implements Plugin<Project> {
    private RepoCondition cernExt

    @Override
    void apply(Project project) {
        cernExt = project.extensions.create('predRepo', RepoCondition, project)

        if (cernExt.condition.get()) {
            cernExt.buildscriptReposCern?.execute(project.buildscript.repositories)
            cernExt.reposCern?.execute(project.repositories)
        } else {
            cernExt.buildscriptRepos?.execute(project.buildscript.repositories)
            cernExt.repos?.execute(project.repositories)
        }
    }
}
