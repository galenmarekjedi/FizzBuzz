import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    for(i in scanner.nextInt()..scanner.nextInt()) {
        println(when {
            i % 15 == 0 -> "FizzBuzz"
            i % 5 == 0 -> "Buzz"
            i % 3 == 0 -> "Fizz"
            else -> "$i"
        })
    }
}