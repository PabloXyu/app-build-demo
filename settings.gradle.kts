import org.gradle.kotlin.dsl.support.classFilePathCandidatesFor
import org.gradle.kotlin.dsl.support.classPathBytesRepositoryFor

// since Gradle 5.0 DO NOT »include(":buildSrc")« here as it is a reserved name.
include(":app")
includeBuild("buildPlg")

rootProject.name = "app-build-demo"

pluginManagement {
    //classFilePathCandidatesFor("com.android.tools.build:gradle:7.0.3")
    plugins{
        //id("com.android.tools.build:gradle:7.0.3") apply(true)
        //id("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30") apply(true)
    }
    @Suppress("LocalVariableName")
    resolutionStrategy {
        val KOTLIN_VERSION:String by System.getProperties()
        val AGP_VERSION:String by System.getProperties()
        //val AGP_VERSION = "7.0.3"
        //todo: ^ delete this line?

        eachPlugin {
            when (requested.id.namespace) {
                //"org.jetbrains.kotlin" -> useVersion(KOTLIN_VERSION)
                "org.jetbrains.kotlin" -> useVersion("1.5.31")
                "com.android" -> {

                    //useModule("com.android.tools.build:gradle:7.0.3")
                    useModule("com.android.tools.build:gradle:7.0.4")
                    //useVersion(AGP_VERSION)
                }
            }
        }
    }

    // Dependency Resolution Management:

    // Instead of declaring repositories in every build subproject or via an allprojects block
    // Gradle offers a way to declare them in a central place for all projects.
    //
    // Repositories Mode FAIL_ON_PROJECT_REPOS mode enforce that only settings repositories are used.
    @Suppress("UnstableApiUsage")
    dependencyResolutionManagement
        .repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
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

/**
 *
 * Anatomy of a Gradle plugin

A plugin is a simple jar file containing JVM class files.
It’s like a java library or executable jar except the entry point,
instead of being main() is a class that can be applied to a Project :
 *
 */

/**
 *
 * Plugin anatomy:
 *
 * This allows Gradle to do smart things such as:
 * Optimize the loading and reuse of plugin classes
 * Allow different plugins to use different versions of dependencies.
 * Provide editors detailed information about the potential properties and values in the buildscript for editing assistance.
 *
 */


