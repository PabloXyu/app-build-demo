@file:Suppress("KDocUnresolvedReference")

package extension_temp

import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import javax.inject.Inject

/**
 * ### `extra` extension root level:
 *
 * @param DslObject1stDepthLevel - An instance of the [ObjectFactory] can be injected into a task, plugin
 * or other object by annotating a public constructor or property getter method with
 * `javax.inject.Inject`.
 *
 * <br></br>
 * ```
 * extra {
 *     colourPrintln {
 *
 *         message("Hi!") //text output in default colour (WHITE)
 *
 *         message("FooBar", GREEN)
 *
 *         colour(BLUE)
 *         message("Hello World")
 *
 *         logo {
 *             fixme: printLogo(Elephant)
 *         }
 *     }
 *
 *     colourPrint {
 *
 *         message("Foo", GREEN)
 *         message("Bar\n", RED")
 *
 *         colour(BLUE)
 *         message("Hello World\n")
 *
 *         logo {
 *             fixme: printLogo(Elephant)
 *         }
 *     }
 * }
 * ```
 *
 * <br></br>
 * @see <p align="right"><a href="https://dev.to/autonomousapps/gradle-plugins-and-extensions-a-primer-for-the-bemused-51lp">
 * Gradle plugins and extensions: A primer for the bemused</a></p>
 * <p align="right"><i>25th of October, 2021</i></p><br>
 *
 * @see <p align="right"><a href="http://www.thinkcode.se/blog/2015/03/22/a-gradle-plugin-written-in-java">
 * A Gradle plugin written in Java</a></p>
 * <p align="right"><i>22th of March, 2015</i></p><br>
 *
 * <br></br>
 */
open class ExtraExtension @Inject constructor(DslObject1stDepthLevel: ObjectFactory) {

    /** Configure the inner DSL object [ColourPrintlnHandler], depth level:1  . */
    private val colorPrintln: ColourPrintlnHandler = DslObject1stDepthLevel
        .newInstance(ColourPrintlnHandler::class.java)

    /** [Action]<[T]> functions enable the DSL syntax */
    private fun colorPrintln(action: Action<ColourPrintlnHandler>) {
        action.execute(colorPrintln)
    }

    companion object {
        private const val EXTENSION_NAME = "extra"

        fun Project.extra(): ExtraExtension = extensions
            .create(EXTENSION_NAME, ExtraExtension::class.java)
    }
}

/**
 * ### `extra` extension 2nd depth level, ([ColourPrintlnHandler]):
 *
 * @constructor
 * TODO
 *
 * @param DslObject2ndDepthLevel
 */
open class ColourPrintlnHandler @Inject constructor(DslObject2ndDepthLevel: ObjectFactory) {

    /** Configure the innermost DSL object [LogoHandler], depth level:2. */
    private val logo: LogoHandler = DslObject2ndDepthLevel
        .newInstance(LogoHandler::class.java)

    /** Configure the innermost DSL object [LogoHandler], depth level:2. */
    fun logo(action: Action<LogoHandler>) {
        action.execute(logo)
    }
}

/**
 * An even-more inner DSL object.
 */

/**
 * TODO
 *
 */
open class LogoHandler {

    private val whoToPrintLogo = mutableListOf<String>()
    internal val victims: List<String> get() = whoToPrintLogo.toList()

    /** Tells the app which logo - it should print. */
    fun printLogo(who: String) {
        whoToPrintLogo.add(who)
    }
}
