package pl.simplecoding.krakowkug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @Author Artur Czopek
 * @Link https://simplecoding.pl/krakow-kug
 */

@SpringBootApplication
class KrakowKugApplication

fun main(args: Array<String>) {
    runApplication<KrakowKugApplication>(*args)
}
