import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var output = 0
    for  (number in scanner.next())
    {
        output += number.toString().toInt()
    }
    print(output)
}