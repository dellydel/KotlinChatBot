import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val rangeStart = scanner.nextInt()
    val rangeEnd = scanner.nextInt()
    val range = rangeStart..rangeEnd
    var sum = 0
    for (num in range) {
        sum += num
    }
    print(sum)
}