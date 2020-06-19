import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val letterOne = scanner.next()
    val letterTwo = scanner.next()
    print(letterOne.toLowerCase() == letterTwo.toLowerCase())
}