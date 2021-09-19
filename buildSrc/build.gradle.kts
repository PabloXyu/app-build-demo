/**
 * »buildSrc« is a directory at the project root level which contains build info.
 * We can use this directory to enable kotlin-dsl
 * and write logic related to custom configuration
 * and share them across the project.
 * It was one of the most used approaches in recent days because of its testability.
 *
 * Gradle Doc:
 *
 * The directory »buildSrc« is treated as an included build.
 * Upon discovery of the directory, Gradle automatically compiles and tests
 * this code and puts it in the classpath of your build script.
 * There can be only one buildSrc directory for multi-project builds,
 * which has to sit in the root project directory.
 * »buildSrc« should be preferred over script plugins as it is easier
 * to maintain, refactor, and test the code.
 */

/**
 * The Kotlin DSL Plugin
 * provides a convenient way to develop Kotlin-based projects as:
 * * buildSrc projects
 * * included builds
 * * Gradle plugins.
 *
 * The plugin achieves this by doing the following:
 * * Applies the Kotlin Plugin, which adds support for compiling Kotlin source files.
 * * Configures the Kotlin compiler to Kotlin DSL scripts.
 * * Enables support for precompiled script plugins.
 * * Adds dependencies below to the compileOnly and testImplementation configurations:
 * * * kotlin-stdlib-jdk8
 * * * kotlin-reflect
 * * * gradleKotlinDsl()

 * The Java Gradle Plugin development plugin
 * can be used to assist in the development of Gradle plugins.
 * It automatically applies the Java Library plugin,
 * adds the gradleApi() dependency to the api configuration
 * and performs validation of plugin metadata during jar task execution.

 *
 * Java Gradle Development Plugin
 * automatically applies the Java Plugin,
 * adds the gradleApi() dependency to the api configuration,
 * generate the required plugin descriptors in the resulting JAR file
 * and configure the Plugin Marker Artifact to be used when publishing.
 */

//import task.StyledTextTask

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()// so that external plugins can be resolved in dependencies section
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.30")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.30")
}

gradlePlugin {
    plugins {
        create("styledTextPlugin") {
            id = "com.example.plugin.styled-text"
           implementationClass = "plugin.StyledTextPlugin"
        }
    }
}

//apply(plugin = "styledTextPlugin")

/*
tasks.register<StyledTextTask>("styledText")
*/


