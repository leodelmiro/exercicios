import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var positiveNumbers = 0
    var negativeNumbers = 0
    var neutralNumber = 0
    val arraySize = arr.size

    for (i in arr.indices){
        when {
            arr[i] > 0 -> positiveNumbers+=1
            arr[i] == 0 -> neutralNumber+=1
            arr[i] < 0 -> negativeNumbers+=1
        }
    }

    val ratioPositive: Double = (positiveNumbers).toDouble()/(arraySize).toDouble()
    val ratioNegative:Double = (negativeNumbers).toDouble()/(arraySize).toDouble()
    val ratioNeutral:Double = (neutralNumber).toDouble()/(arraySize).toDouble()

    return println("$ratioPositive\n$ratioNegative\n$ratioNeutral")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
