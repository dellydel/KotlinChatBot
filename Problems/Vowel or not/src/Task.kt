import java.util.Scanner

fun isVowel(character: Char): Boolean {
    return character.toLowerCase() == 'a' ||
            character.toLowerCase() == 'e' ||
            character.toLowerCase() == 'i' ||
            character.toLowerCase() == 'o' ||
            character.toLowerCase() == 'u'
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}