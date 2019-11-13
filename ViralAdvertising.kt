import java.util.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the viralAdvertising function below.
fun viralAdvertising(n: Int): Int {
    var cumulative = 0
    var shared = 5
    for (i in 0 until n){
        val liked = if(shared%2==0) shared/2 else ((shared/2)-((shared%2)/2))
        shared = liked*3
        cumulative += liked
    }
    return cumulative
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
