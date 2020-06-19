import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val int1 = scanner.nextInt()
    val int2 = scanner.nextInt()
    val int3 = scanner.nextInt()
    val int4 = scanner.nextInt()
    val int5 = scanner.nextInt()

    val range1 = int1..int2
    val range2 = int3..int4

    print(int5 in range1 || int5 in range2)
}
