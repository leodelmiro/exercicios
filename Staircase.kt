import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the staircase function below.
fun staircase(n: Int): Unit {
    val symbol = "#"
    val space = " "
    for (i in 1..n){
        println(space.repeat(n-i).plus(symbol.repeat(i)))
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
