import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    repeat(n) {
        val size = scanner.nextInt()
        if (size == 1) {
            larger++
        } else if (size == -1) {
            smaller++
        } else {
            perfect++
        }
    }
    print("$perfect $larger $smaller")
}
