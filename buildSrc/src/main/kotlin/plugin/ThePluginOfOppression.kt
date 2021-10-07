package plugin

import extension_temp.ExtraExtension.Companion.extra
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Recall that
 *[extra]
 * is a companion function that is simply
 *
 * `project.extensions.create("extra", ExtraExtension::class.java)`
 */
class ThePluginOfOppression : Plugin<Project> {

    override fun apply(project: Project) = project.run {
        // apply additional plugins
        pluginManager.apply("org.jetbrains.kotlin.jvm")
        pluginManager.apply("application")

        // create the extension
        val extra = extra()
    }

    // 3: Wait for the DSL to be evaluated, and use the information provided
/*
    afterEvaluate {
        tasks.named("run", JavaExec::class.java) {
            it.args = theState.colorPrintln.theDeepestState.victims
        }
    }
*/

}

