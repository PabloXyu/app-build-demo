//import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/**
 * The top-level build.gradle file, located in the root project directory,
 * defines dependencies that apply to all modules in the project.
 * 
 * By default, the top-level build file uses the plugins{} block
 * to define the Gradle dependencies that are common to all modules in the project.
 *
 * Top-level build file where you can add configuration options
 * common to all sub-projects/modules.
 *
 */

//https://github.com/PabloXyu/app-build-demo/edit/master/README.md#the-top-level-build-file

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

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
        //classpath("com.android.tools.build:gradle:7.0.3")
        //classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.30")
        // NOTE: Do not place your application dependencies here,
        // they belong in the individual module build.gradle files
    }
}

// the snippet below makes sure that all
// src/[main|test|androidTest]/kotlin dirs
// are Source Roots for each module/subproject

/*
sourceSets.all {
java.srcDir("src/$name/kotlin")
}

*/
