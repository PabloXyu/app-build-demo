/**
 * This settings.gradle file, located in the root project directory,
 * defines project-level repository settings and tells Gradle
 * which modules it should include when building the app.
 */

// since Gradle 5.0 DO NOT »include(":buildSrc")« here as it is a reserved name.
include(":app")
includeBuild("buildPlg")
/* todo^ explain includeBuild*/

rootProject.name = "app-build-demo"

pluginManagement {
    repositories {
        /**
         * The pluginManagement.repositories block
         * configures the repositories which Gradle uses
         * to search or download the Gradle plugins
         * and their transitive dependencies.
         *
         * Gradle pre-configures support for remote repositories in the block.
         * You can also use local repositories or define your own remote ones.
         * The code below defines the Gradle Plugin Portal, Maven Google & Central repository
         * as the repositories Gradle should use to look for its dependencies.
         */
        gradlePluginPortal()
        mavenCentral()
        google()
    }
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

                    useModule("com.android.tools.build:gradle:7.0.4")
                    //useVersion(AGP_VERSION)
                }
            }
        }
    }

    @Suppress("UnstableApiUsage") // todo: check if still required
    /**
     * Instead of declaring repositories
     * in every build subproject or via an allprojects block
     * Gradle offers a way to declare them in a central place for all projects.
     */
    dependencyResolutionManagement {
        /**
         * FAIL_ON_PROJECT_REPOS mode enforce
         * that only settings repositories are used.
         */
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

        /**
         * The dependencyResolutionManagement.repositories block
         * is where you configure the repositories and dependencies used by
         * all modules in your project, such as libraries that you are using to
         * create your application. However, you should configure module-specific
         * dependencies in each module-level build.gradle file.
         * For new projects, Android Studio includes Maven Google & Central
         * repositories by default, but it does not configure any dependencies
         * (unless you select a template that requires some).
         */
        repositories {
            google()
            mavenCentral()
        }

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
