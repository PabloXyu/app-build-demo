package plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.register
import plugin.extension.StyledTextPluginExtension
import task.StyledTextTask

/*
class StyledTextPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("styledText") {
            doLast {
                println("Hello from the GreetingPlugin")
            }
        }
    }
}
*/

class StyledTextPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            //tasks.create("styledText", StyledTextTask::class)
            tasks.register("styledText",StyledTextTask::class)
            //extensions.create("styleText", StyledTextPluginExtension::class)
        }
    }
}

