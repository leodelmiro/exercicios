import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the hurdleRace function below.
fun hurdleRace(k: Int, height: Array<Int>): Int {
    val maximumHurdle = height.max()!!
    return if(maximumHurdle > k) maximumHurdle - k else 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val height = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
