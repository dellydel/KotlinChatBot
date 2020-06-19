import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val value = scanner.nextInt()
    print(value < 10 && value > 0)
}