// Click on the link below with [CTRL] Key:
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/the-top-level-build-file.md


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
