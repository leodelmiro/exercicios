import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the birthdayCakeCandles function below.
fun birthdayCakeCandles(ar: Array<Int>): Int {
    val tallestCandle = ar.max()
    val tallestCandleQuantity = ar.count{it == tallestCandle}
    return tallestCandleQuantity
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arCount = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(ar)

    println(result)
}
