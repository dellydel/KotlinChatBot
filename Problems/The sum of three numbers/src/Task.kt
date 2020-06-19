import java.util.Scanner

fun sum(int1: Int, int2: Int, int3: Int): Int {
    return int1 + int2 + int3
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(sum(a, b, c))
}