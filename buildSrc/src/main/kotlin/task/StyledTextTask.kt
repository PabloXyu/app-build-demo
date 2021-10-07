package task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.internal.logging.text.StyledTextOutput.Style
import org.gradle.internal.logging.text.StyledTextOutputFactory
import javax.inject.Inject

/**
 * # [StyledTextTask] #
 * is a *Gradle* task to print text bold or coloured.
 * This is based on *Gradle* predefined logger message styles.
 *
 * @param outputFactory is passed as an argument value to a [StyledTextTask] constructor.
 *
 * @see <p align="right"><a href="https://docs.gradle.org/current/userguide/more_about_tasks.html#sec:passing_arguments_to_a_task_constructor">
 * Passing arguments to a task constructor</a></p>
 * <p align="right"><i>20th of August, 2021</i></p><br>
 */
abstract class StyledTextTask @Inject constructor(
    private val outputFactory: StyledTextOutputFactory
) : DefaultTask() {

    private val output = outputFactory.create("dummyLogCategory")

    @TaskAction
    fun run() {
        println("Text Style Colour Values:")
        println("=========================")

        Colour.values().forEach {
            output.style(it.gradleLogStyle).println("Colour.$it")
        }
    }

    enum class Colour(val gradleLogStyle: Style) {
        NORMAL(Style.Normal),
        BOLD(Style.Header),
        GREEN(Style.Success),
        GREEN_BRIGHT(Style.SuccessHeader),
        RED(Style.Failure),
        RED_BRIGHT(Style.FailureHeader),
        YELLOW(Style.Info),
    }
}

