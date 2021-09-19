package task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.internal.logging.text.StyledTextOutput
import org.gradle.internal.logging.text.StyledTextOutputFactory
import javax.inject.Inject

abstract class StyledTextTask @Inject constructor(outputFactory: StyledTextOutputFactory) :
    DefaultTask() {

    private val output = outputFactory.create("styled-text")//create log-category

    @TaskAction
    fun run() {
        println("=========================")
        println("Environment: ${System.getenv("USECOLOR")}")
        println("=========================")
        println("Gradle Text Style Values:")
        println("=========================")
        StyledTextOutput.Style.values().forEach {
            output.style(it).println("StyledTextOutput.Style.$it")
        }
    }
}
