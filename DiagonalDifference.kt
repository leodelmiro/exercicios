import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var primaryDiagonal = 0
    var secondaryDiagonal = 0
    val arraySize = arr.size

    for (i in 0 until arraySize){
        primaryDiagonal += arr[i][i]
        secondaryDiagonal += arr[i][arraySize - 1 - i]
    }

    return Math.abs(primaryDiagonal - secondaryDiagonal) //Ou apenas .abs (HackerRank .abs não funciona)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
