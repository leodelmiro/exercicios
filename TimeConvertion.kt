package hackerRank

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*
import java.text.SimpleDateFormat;

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    val inputHour = SimpleDateFormat("hh:mm:ssaa")
    val displayHour = SimpleDateFormat("HH:mm:ss")

    return displayHour.format(inputHour.parse(s))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
