//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Top-level build file where you can add configuration options
// common to all sub-projects/modules.

/**
 * The repositories block configures the repositories
 * Gradle uses to search or download the dependencies.
 * Gradle pre-configures support for remote repositories
 * such as Google, Maven Central, and Gradle Plugin Portal.
 * You can also use local repositories or define your own remote repositories.
 */

/**
 * The buildscript block is where you configure
 * the repositories and dependencies for Gradle itself—meaning,
 * you should not include dependencies for your modules here.
 *
 * For example,
 * this block includes the Android plugin for Gradle as a dependency
 * because it provides the additional instructions
 * Gradle needs to build Android app modules.
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

// plugin{} block always first!
/*
plugins {
    kotlin("jvm")
}

//Experimental inline class


    tasks.compileKotlin {
        kotlinOptions.freeCompilerArgs = listOf("-Xinline-classes")
    }
*/
