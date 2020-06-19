import java.util.*

// write your function here
fun isGreater(int1: Int, int2: Int, int3: Int, int4: Int): Boolean {
    return int1 + int2 > int3 + int4
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    val number4 = scanner.nextInt()

    println(isGreater(number1, number2, number3, number4))
}
