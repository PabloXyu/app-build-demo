include(":app")

// ^IDE may add gradle »include« at the beginning of settings file automatically...

rootProject.name = "app-build-demo"
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
// since Gradle 5.0 DO NOT include(":buildSrc") here as it is a reserved name.
