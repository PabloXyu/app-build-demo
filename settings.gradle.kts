@file:Suppress("UnstableApiUsage")

include(":app")
// ^IDE may add »include()« line on top when refactoring…
// since Gradle 5.0 DO NOT »include(":buildSrc")« here as it is a reserved name.
includeBuild("buildPlg")
rootProject.name = "app-build-demo"

// Dependency Resolution Management:

// Instead of declaring repositories in every subproject of your build
// or via an allprojects block,
// Gradle offers a way to declare them in a central place for all project.

// Repositories Mode:
// FAIL_ON_PROJECT_REPOS mode enforce that only settings repositories are used.
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

/**
 * Kotlin DSL Plugin
 * -----------------
 * adds:
 *
 * kotlin-stdlib-jdk8,
 * kotlin-reflect
 * and gradleKotlinDsl() dependencies
 *
 * to the compileOnly and testImplementation configurations,
 * which allows make use of those Kotlin libraries
 * and the Gradle API in Kotlin code
 *
 * so implementation(kotlin("gradle-plugin") is not needed,
 * Kotlin DSL API extends Gradle public API
 *
 * When using Gradle Kotlin DSL, apply the Kotlin plugins using the plugins{} block
 * Only plugins published in Gradle Plugin Portal can be applied
 */

/**
 * Kotlin DSL Pros:
 * ==================================
 *  • Simplified plugins syntax
 *  • Default lazy task configuration
 *  • Compile time checks
 *  • Better IDE experience
 *  • It’s Kotlin!
 */
