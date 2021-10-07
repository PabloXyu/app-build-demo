@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package util

import java.util.*

/**
 * ©Paweł Zygmunciak 2021
 * # [NamingStyleConversion] utility class #
 *
 * ## Naming convention for object names in Android project (Java & Kotlin) ##
 *
 * `camelCase            ` : function, property and local variable names
 *
 * `dot.case             ` : package path, gradle module group names`
 *
 * `kebab-case           ` : gradle plugin names
 *
 * `PascalCase           ` : class & interface names
 *
 * `snake_case           ` : android resources xml file names
 *
 * `SCREAMING_SNAKE_CASE ` : constant names
 *
 * `_underscorePrefix    ` : baking property names
 * ###
 * ### Terms used here: ###
 * * *non-initial word* means any word in the name , but not first.
 * * *separator* is a character which splits up words in the name, there are three of them:
 *
 *    ***`.`*** dot
 *
 *    ***`-`*** hyphen
 *
 *    ***`_`*** underscore
 *
 * * *separator case* means any naming style with a separator between words which are:
 *    * `dot.case`
 *    * `kebab-case`
 *    * `snake_case`
 * @see <p align="right"><a href="https://regex101.com/">
 * Regex 101</a></p>
 * @see <p align="right"><a href="https://codeburst.io/java-and-regex-101-5b1e5ed315dd">
 * Java and Regex 101</a></p>
 * <p align="right"><i>22nd of June, 2017</i></p><br>
 */
open class NamingStyleConversion {

    private enum class Do(val caseFunction: (String) -> String) {
        LOWERCASE({ it.toLowerCase(LOCALE) }),
        UPPERCASE({ it.toUpperCase(LOCALE) }),
        DECAPITALIZE({ it.decapitalize(LOCALE) }),
        CAPITALIZE({ it.capitalize(LOCALE) });

        companion object {
            val LOCALE: Locale = Locale.ROOT
        }

        infix fun of(input: String) = values()[ordinal].caseFunction(input)
    }

    /**
     * ### Regex special characters: ###
     * ### `. + * ? ^ $ ( ) [ ] { } | \` ###
     */
    private companion object Regex {
        /**
         * Emptiness is Form, Form is Emptiness...
         */
        const val EMPTY = ""

        /**
         * separators:
         */
        const val DOT = "\\."
        const val HYPHEN = "-"
        const val UNDERSCORE = "_"

        /**
         * characters:
         */
        const val LETTER = "[a-zA-Z]"
        const val LOWERCASE = "[a-z]"
        const val LOWERCASE_OR_DIGIT = "[a-z0-9]"
        const val CAPITAL = "[A-Z]"
        const val ALPHANUMERIC = "[a-zA-Z0-9]"


        /**
         * ## Regular Expression Patterns ##
         */

        // ^
        const val START_OF_STRING = "^"

        // (?<=[a-z])(?=[A-Z])
        const val START_OF_NON_INITIAL_CAPITALIZED_WORD = "(?<=$LOWERCASE)(?=$CAPITAL)"

        // [A-Z]+[^A-Z]*$
        const val CAPITALIZED_SUFFIX = "$CAPITAL+$LOWERCASE_OR_DIGIT*\$" //pascal, camel

        // [a-zA-Z0-9]*$
        const val SUFFIX_AFTER_SEPARATOR = "$ALPHANUMERIC*\$" // dot, kebab, snake

        // [\.]+[a-zA-Z0-9]*$
        const val DOT_WITH_SUFFIX = "[$DOT]+$SUFFIX_AFTER_SEPARATOR" // dot

        // [-]+[a-zA-Z0-9]*$
        const val HYPHEN_WITH_SUFFIX = "[$HYPHEN]+$SUFFIX_AFTER_SEPARATOR" // kebab

        // [_]+[a-zA-Z0-9]*$
        const val UNDERSCORE_WITH_SUFFIX = "[$UNDERSCORE]+$SUFFIX_AFTER_SEPARATOR" // snake

        // [\.][a-zA-Z]
        const val DOT_WITH_LETTER = "[$DOT]$LETTER" // dot

        // [-][a-zA-Z]
        const val HYPHEN_WITH_LETTER = "[$HYPHEN]$LETTER" // kebab

        // [_][a-zA-Z]
        const val UNDERSCORE_WITH_LETTER = "[$UNDERSCORE]$LETTER" // snake

        // [a-z0-9]+
        const val CAMEL_CASE_PREFIX = "$LOWERCASE_OR_DIGIT+"

        // ^[a-zA-Z0-9][a-z0-9]*
        const val PASCAL_CASE_PREFIX = "^$ALPHANUMERIC$LOWERCASE_OR_DIGIT*"

        // ^[a-zA-Z0-9]
        const val WORD_BEFORE_SEPARATOR = "^$ALPHANUMERIC"

        // [\.]*
        const val FIRST_DOT = "[$DOT]*"

        // [-]*
        const val FIRST_HYPHEN = "[$HYPHEN]*"

        // [_]*
        const val FIRST_UNDERSCORE = "[$UNDERSCORE]*"

        // ^[a-zA-Z0-9]+[\.]*
        const val PREFIX_WITH_DOT = "$WORD_BEFORE_SEPARATOR+$FIRST_DOT"

        // ^[a-zA-Z0-9]+[-]*
        const val PREFIX_WITH_HYPHEN = "$WORD_BEFORE_SEPARATOR+$FIRST_HYPHEN"

        // ^[a-zA-Z0-9]+[_]*
        const val PREFIX_WITH_UNDERSCORE = "$WORD_BEFORE_SEPARATOR+$FIRST_UNDERSCORE"

        // ^[_](?=[^_])
        const val LEADING_UNDERSCORE = "^[$UNDERSCORE](?=[^$UNDERSCORE])"

        /**
         * ## *`Replace`*, *`Remove`* and *`Find`* regex methods ##
         */
        private fun String.regexReplace(oldValue: String, newValue: String): String =
            toRegex().replace(oldValue, newValue)

        private fun String.regexReplace(
            input: CharSequence,
            transform: (MatchResult) -> CharSequence
        ): String = toRegex().replace(input, transform)

        private fun String.regexRemove(string: String): String =
            toRegex().replace(string, EMPTY)

        private fun String.regexFind(string: String): String =
            toRegex().find(string).toString()

        /**
         * inserts separator before capital letter and lowercase it
         */
        // (camel, pascal) -> (dot, kebab, snake)
        private fun String.camelToSeparatorCase(separator: String): String =
            Do.LOWERCASE of
                    START_OF_NON_INITIAL_CAPITALIZED_WORD
                        .regexReplace(this, separator)

        /**
         * removes word leading separator capitalize the word
         */
        // (dot, kebab, snake) -> (camel, pascal)
        private fun String.separatorToCamelCase(separator: String): String = "$separator$LETTER"
            .regexReplace(this) {
                Do.UPPERCASE of it.value.replace(separator, EMPTY)
            }

        private fun String.separatorCasePrefix(): String = WORD_BEFORE_SEPARATOR.regexFind(this)
        private fun String.separatorCaseSuffix(): String = SUFFIX_AFTER_SEPARATOR.regexFind(this)
    }

    /**
     * ## Naming Style Transitions ##
     */

    // e.g: twoWords -> two.words, two-words, TwoWords, two_words, TWO_WORDS
    fun String.camelToDotCase(): String = camelToSeparatorCase(DOT)
    fun String.camelToKebabCase(): String = camelToSeparatorCase(HYPHEN)
    fun String.camelToPascalCase(): String = Do.CAPITALIZE of this
    fun String.camelToSnakeCase(): String = camelToSeparatorCase(UNDERSCORE)
    fun String.camelToScreamingSnakeCase(): String = Do.UPPERCASE of camelToSeparatorCase(UNDERSCORE)

    // e.g: two.words -> twoWords, two-words, TwoWords, two_words, TWO_WORDS
    fun String.dotToCamelCase(): String = separatorToCamelCase(DOT)
    fun String.dotToKebabCase(): String = replace(DOT, HYPHEN)
    fun String.dotToPascalCase(): String = Do.CAPITALIZE of separatorToCamelCase(DOT)
    fun String.dotToSnakeCase(): String = replace(DOT, UNDERSCORE)
    fun String.dotToScreamingSnakeCase(): String = Do.UPPERCASE of replace(DOT, UNDERSCORE)

    // e.g: two-words -> twoWords, two.words, TwoWords, two_words, TWO_WORDS
    fun String.kebabToCamelCase(): String = separatorToCamelCase(HYPHEN)
    fun String.kebabToDotCase(): String = replace(HYPHEN, DOT)
    fun String.kebabToPascalCase(): String = Do.CAPITALIZE of separatorToCamelCase(HYPHEN)
    fun String.kebabToSnakeCase(): String = replace(HYPHEN, UNDERSCORE)
    fun String.kebabToScreamingSnakeCase(): String = Do.UPPERCASE of replace(HYPHEN, UNDERSCORE)

    // e.g: TwoWords -> twoWords, two.words, two-words, two_words, TWO_WORDS
    fun String.pascalToCamelCase(): String = Do.DECAPITALIZE of this
    fun String.pascalToDotCase(): String = camelToSeparatorCase(DOT)
    fun String.pascalToKebabCase(): String = camelToSeparatorCase(HYPHEN)
    fun String.pascalToSnakeCase(): String = camelToSeparatorCase(UNDERSCORE)
    fun String.pascalToScreamingSnakeCase(): String =
        Do.UPPERCASE of camelToSeparatorCase(UNDERSCORE)

    // e.g: two_words -> twoWords, two.words, two-words, TwoWords, TWO_WORDS
    fun String.snakeToCamelCase(): String = separatorToCamelCase(UNDERSCORE)
    fun String.snakeToDotCase(): String = replace(UNDERSCORE, DOT)
    fun String.snakeToKebabCase(): String = replace(UNDERSCORE, HYPHEN)
    fun String.snakeToPascalCase(): String = Do.CAPITALIZE of separatorToCamelCase(UNDERSCORE)
    fun String.snakeToScreamingSnakeCase(): String = Do.UPPERCASE of this

    // e.g: TWO_WORDS -> twoWords, two.words, two-words, TwoWords, two_words,
    fun String.snakeScreamingToCamelcase(): String =
        (Do.LOWERCASE of this).separatorToCamelCase(UNDERSCORE)

    fun String.screamingSnakeToDotCase(): String = Do.LOWERCASE of snakeToDotCase()
    fun String.screamingSnakeToKebabCase(): String = Do.LOWERCASE of snakeToKebabCase()
    fun String.screamingSnakeToPascalCase(): String = Do.CAPITALIZE of snakeToCamelCase()
    fun String.screamingSnakeToSnakeCase(): String = Do.LOWERCASE of this

    // PREFIX REMOVAL
    fun String.removeCamelCasePrefix(): String = CAMEL_CASE_PREFIX.regexRemove(this)
    fun String.removeDotCasePrefix(): String = PREFIX_WITH_DOT.regexRemove(this)
    fun String.removeKebabCasePrefix(): String = PREFIX_WITH_HYPHEN.regexRemove(this)
    fun String.removePascalCasePrefix(): String = PASCAL_CASE_PREFIX.regexRemove(this)
    fun String.removeSnakeCasePrefix(): String = PREFIX_WITH_UNDERSCORE.regexRemove(this)
    fun String.removeScreamingSnakeCasePrefix(): String = removeSnakeCasePrefix()

    // SUFFIX REMOVAL
    fun String.removeCamelCaseSuffix(): String = CAPITALIZED_SUFFIX.regexRemove(this)
    fun String.removeDotCaseSuffix(): String = DOT_WITH_SUFFIX.regexRemove(this)
    fun String.removeKebabCaseSuffix(): String = HYPHEN_WITH_SUFFIX.regexRemove(this)
    fun String.removePascalCaseSuffix(): String = removeCamelCaseSuffix()
    fun String.removeSnakeCaseSuffix(): String = UNDERSCORE_WITH_SUFFIX.regexRemove(this)
    fun String.removeScreamingSnakeCaseSuffix(): String = removeSnakeCaseSuffix()

    // LEADING UNDERSCORE INSERT & REMOVAL
    fun String.insertLeadingUnderscore(): String = START_OF_STRING.regexReplace(this, UNDERSCORE)
    fun String.removeLeadingUnderscore(): String = LEADING_UNDERSCORE.regexRemove(this)

    // FIND PREFIX
    fun String.camelCasePrefix(): String = CAMEL_CASE_PREFIX.regexFind(this)
    fun String.dotCasePrefix(): String = separatorCasePrefix()
    fun String.kebabCasePrefix(): String = separatorCasePrefix()
    fun String.pascalCasePrefix(): String = PASCAL_CASE_PREFIX.regexFind(this)
    fun String.snakeCasePrefix(): String = separatorCasePrefix()
    fun String.screamingSnakeCasePrefix(): String = separatorCasePrefix()

    // FIND SUFFIX
    fun String.camelCaseSuffix(): String = CAPITALIZED_SUFFIX.regexFind(this)
    fun String.dotCaseSuffix(): String = separatorCaseSuffix()
    fun String.kebabCaseSuffix(): String = separatorCaseSuffix()
    fun String.pascalCaseSuffix(): String = camelCaseSuffix()
    fun String.snakeCaseSuffix(): String = separatorCaseSuffix()
    fun String.screamingSnakeCaseSuffix(): String = snakeCaseSuffix()

}
