package io.cursedfunction

fun main() {}

fun buildCarol(): String {
    return buildString {
        // Iterate through each entry in the Inflections enum
        Inflections.entries.forEach { inflection ->
            // Append each stanza
            appendLine(buildStanza(inflection.day))

            // Add a newline in-between each stanza
            appendLine()
        }
    }.trimEnd() // Trim the ending newline
}

fun buildStanza(day: Int): String {
    return buildString {
        // Append the opening verses of the stanza
        appendLine(Inflections.getOpeningLines(day))

        // Loop in reverse down to zero
        for (i in (day - 1) downTo 0) {
            // Append each verse
            appendLine(giftVerses[i])
        }
    }.trimEnd() // Trim the ending newline
}

/**
 * The inflections (words) which represent a number (day).
 */
private enum class Inflections(val day: Int, val inflection: String) {
    FIRST(day = 1, inflection = "first"),
    SECOND(day = 2, inflection = "second"),
    THIRD(day = 3, inflection = "third"),
    FOURTH(day = 4, inflection = "fourth"),
    FIFTH(day = 5, inflection = "fifth"),
    SIXTH(day = 6, inflection = "sixth"),
    SEVENTH(day = 7, inflection = "seventh"),
    EIGHTH(day = 8, inflection = "eighth"),
    NINTH(day = 9, inflection = "ninth"),
    TENTH(day = 10, inflection = "tenth"),
    ELEVENTH(day = 11, inflection = "eleventh"),
    TWELFTH(day = 12, inflection = "twelfth");

    companion object {
        /**
         * Helper method to obtain the opening lines of the carol replacing
         * the [day] with its corresponding inflection.
         *
         * Example: Given a [day] of 1 this method will use the word 'first'
         * as its inflection
         */
        fun getOpeningLines(day: Int): String {
            val inflection = entries.first { inflection -> inflection.day == day }.inflection

            return """
                On the $inflection day of Christmas,
                My true love sent to me:
            """.trimIndent()
        }
    }
}

/**
 * A list of verses for the carol.
 */
private val giftVerses = listOf(
    "A partridge in a pear tree.",
    "Two turtle doves and",
    "Three french hens",
    "Four calling birds",
    "Five golden rings",
    "Six geese a-laying",
    "Seven swans a-swimming",
    "Eight maids a-milking",
    "Nine ladies dancing",
    "Ten lords a-leaping",
    "Eleven pipers piping",
    "Twelve drummers drumming",
)
