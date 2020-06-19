import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char = scanner.next().first()
    print(char.isUpperCase() || char.isDigit() && char != '0')
}
