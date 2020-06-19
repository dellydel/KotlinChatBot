import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val end = scanner.nextInt()
    var result: Long = 1

    for (i in start until end) {
        result *= i
    }
    print(result)
}