import java.util.*

// Complete the catAndMouse function below.
fun catAndMouse(x: Int, y: Int, z: Int): String {
    val distanceACatAndMouse = if (x > z) x - z else z - x
    val distanceBCatAndMouse = if (y > z) y - z else z - y
    val whoWons = if ((distanceACatAndMouse) < (distanceBCatAndMouse)) "Cat A" else if ((distanceACatAndMouse) > (distanceBCatAndMouse)) "Cat B" else "Mouse C"

    return whoWons
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
