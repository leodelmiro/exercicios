import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Long>): Unit {
    val arraySum = arr.sum().let{ print("${it - arr.max()!!} ${it - arr.min()!!}")}
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()

    miniMaxSum(arr)
}