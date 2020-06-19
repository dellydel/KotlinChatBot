import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val one = scanner.nextInt()
    val two = scanner.nextInt()
    val three = scanner.nextInt()
    print(one != two && one != three && two != three)
}