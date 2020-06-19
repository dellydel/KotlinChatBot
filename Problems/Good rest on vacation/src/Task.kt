import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val duration = scanner.nextInt()
    val foodCost = scanner.nextInt()
    val flight = scanner.nextInt()
    val hotel = scanner.nextInt()

    println((foodCost * duration) + (flight * 2) + (hotel * (duration - 1)))
}