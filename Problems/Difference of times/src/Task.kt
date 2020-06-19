import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val firstTime =  scanner.nextInt() * 3600 + scanner.nextInt() * 60 + scanner.nextInt()
    val secondTime = scanner.nextInt() * 3600 + scanner.nextInt() * 60 + scanner.nextInt()
    print(secondTime - firstTime)
}