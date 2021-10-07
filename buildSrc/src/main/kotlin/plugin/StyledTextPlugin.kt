package plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register
import task.StyledTextTask

class StyledTextPlugin : Plugin<Project> {
    override fun apply(project: Project): Unit =
        with(project) {
            tasks.register("styledText",StyledTextTask::class)
            //extensions.create("styledText", StyledTextPluginExtension::class)
        }
}

