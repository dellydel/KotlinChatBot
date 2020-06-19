import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val boy1 = scanner.nextInt()
    val boy2 = scanner.nextInt()
    val boy3 = scanner.nextInt()

    print(boy1 >= boy2 && boy2 >= boy3 || boy3 >= boy2 && boy2 >= boy1)
}
