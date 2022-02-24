// Click on the link below with [CTRL] Key:
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/
// TODO: rename /app-build-demo to /another-app-name dir when used in repo "another-app-name"


//TEST:

// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/00-what-is-the-meaning-of-life.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/01-what-is-gradle.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/02-what-is-an-apk-file.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/03-what-is-jdk.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/04-what-is-kotlin-dsl.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/05-kotlin-dsl-pros.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/06-what-is-a-gradle-project.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/07-gradle-build-phases.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/08-what-is-a-gradle-task.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/09-what-is-a-gradle-plugin.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/10-what-plugins-do.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/11-packaging-a-plugin.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/12-how-gradle-performes-plugin-build-logic.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/13-how-a-plugin-is-created
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/14-how-to-make-the-plugin-configurable
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/15-usage-of-terms-module--project
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/16-the-gradle-settings-file
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/17-the-top-level-build-file.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/18-the-module-level-build-file.md
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/19-what-is-build-sourcebuildsrc-module
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/20-what-is-an-artifact-repository
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/21-what-is-buildscript-block
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/22-what-is-repositories-block
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/23-management-of-dependencies
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/24-configurations-of-dependencies-classpath--implementation
// https://github.com/PabloXyu/app-build-demo/blob/master/readme-FAQ/25-what-is-kotlin-bom-dependency










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
