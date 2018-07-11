package pl.simplecoding.krakowkug


/**
 * @author Artur Czopek
 * @url http://simplecoding.pl/krakow-kug
 */

enum class TokenType {
    GREEN,
    RED;

    companion object {
        @JvmStatic
        fun fromString(value: String) = when (value) {
            "green" -> GREEN
            "red" -> RED
            else -> throw UnsupportedOperationException()
        }
    }
}