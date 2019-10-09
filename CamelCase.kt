import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the camelcase function below.
fun camelcase(s: String): Int {
    return s.split("(?=\\p{Upper})".toRegex()).size
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = camelcase(s)

    println(result)
}
