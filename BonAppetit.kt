import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the bonAppetit function below.
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    val correctBillSplit = (bill.sum() - bill[k])/2
    val moneyThatBrianOwesToAnna = b - correctBillSplit
    if (moneyThatBrianOwesToAnna == 0) print("Bon Appetit") else print("$moneyThatBrianOwesToAnna")
}


fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
