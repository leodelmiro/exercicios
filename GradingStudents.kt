import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val gradesRounded = Array<Int>(grades.size) {0}
    for (i in gradesRounded.indices){
        var studentGrade = grades[i]
        val remainder = studentGrade%5
        if (studentGrade >= 38 && remainder >= 3) studentGrade += (5-remainder)
        gradesRounded[i] = studentGrade
    }
    return gradesRounded
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
