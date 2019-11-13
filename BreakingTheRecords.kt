import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var arrayMinAndMax = Array<Int>(2){ 0 }
    var minValue = scores[0]
    var maxValue = scores[0]
    for (i in 1 until scores.size){
        when {
            scores[i] > maxValue -> {
                arrayMinAndMax[0]+=1
                maxValue = scores[i]
            }
            scores[i] < minValue -> {
                arrayMinAndMax[1] += 1
                minValue = scores[i]
            }
        }
    }

    return arrayMinAndMax
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}