import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the introTutorial function below.
fun introTutorial(V: Int, arr: Array<Int>): Int {
    var indexToFind = 0
    for (i in arr.indices){
        if (arr[i] == V) {
            indexToFind = i
        }
    }
    return indexToFind
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val V = scan.nextLine().trim().toInt()

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = introTutorial(V, arr)

    print(result)
}
