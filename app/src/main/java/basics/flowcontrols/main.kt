package basics.flowcontrols

import java.util.Scanner

fun main() {
    // when statement is similar to switch statement in other programming languages
    // we can also consider this as a nested if-else statements

    var option: Int

    var reader = Scanner(System.`in`)
    print("Enter your option(1 - 4): ")

    option = reader.nextInt()

    var pageResult = when(option){
        1 -> "home page"
        2 -> "services page"
        3 -> "about us page"
        4 -> "contact us page"
        else -> "page not available"
    }

    println(pageResult)
}