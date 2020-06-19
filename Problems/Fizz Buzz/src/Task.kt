import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val start = scanner.nextInt()
    val end = scanner.nextInt()

    for (num in start..end) {

        if (num % 3 == 0 && num % 5 == 0) {
            println("FizzBuzz")
        } else if (num % 3 == 0) {
            println("Fizz")
        } else if (num % 5 == 0) {
            println("Buzz")
        } else {
            println(num)
        }
    }
}
