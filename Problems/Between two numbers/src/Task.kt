import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val int1 = scanner.nextInt()
    val int2 = scanner.nextInt()
    val int3 = scanner.nextInt()

    print(int1 in int2..int3)
}