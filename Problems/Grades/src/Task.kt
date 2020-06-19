import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    var A = 0
    var B = 0
    var C = 0
    var D = 0
    repeat(num) {
        val next = scanner.nextInt()
        if (next == 5) A++
        if (next == 4) B++
        if (next == 3) C++
        if (next == 2) D++
    }
    print("$D $C $B $A")
}
