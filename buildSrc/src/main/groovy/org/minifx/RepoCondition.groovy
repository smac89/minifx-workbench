package org.minifx

import groovy.transform.CompileStatic
import groovy.transform.PackageScope
import groovy.transform.TupleConstructor
import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.provider.Property

import javax.annotation.Nonnull

@CompileStatic
@PackageScope
class RepoCondition {

    Property<Boolean> condition
    protected Action<? super RepositoryHandler> buildscriptReposCern
    protected Action<? super RepositoryHandler> buildscriptRepos
    protected Action<? super RepositoryHandler> reposCern
    protected Action<? super RepositoryHandler> repos

    RepoCondition(Project project) {
        condition = project.objects.property(Boolean).convention(false)
    }

    def buildscriptReposCern (@Nonnull Action<? super RepositoryHandler> config) {
        this.buildscriptReposCern = config
    }

    def buildscriptRepos (@Nonnull Action<? super RepositoryHandler> config) {
        this.buildscriptRepos = config
    }

    def reposCern (@Nonnull Action<? super RepositoryHandler> config) {
        this.reposCern = config
    }

    def repos (@Nonnull Action<? super RepositoryHandler> config) {
        this.repos = config
    }
}
