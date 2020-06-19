import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var input = scanner.nextInt()
    if (input % 2 == 0) {
        print(input + 2)
    } else {
        print(input + 1)
    }
}
