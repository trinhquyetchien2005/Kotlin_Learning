import kotlin.math.sqrt

fun main() {
    println("Nhập a: ")
    val a: Int = readLine()!!.toInt()
    println("Nhập b: ")
    val b: Int = readLine()!!.toInt()
    println("Nhập c: ")
    val c: Int = readLine()!!.toInt()

    if (a == 0) {
        if (b == 0) {
            if (c == 0) { 
                println("Phương trình vô số nghiệm")
            } else {
                println("Phương trình vô nghiệm")
            }
        } else { v 
            val x = -c.toDouble() / b
            println("Phương trình có nghiệm x = $x")
        }
    } else {
        val detal: Int = b * b - 4 * a * c
        if (detal < 0) {
            println("Phương trình vô nghiệm")
        } else if (detal == 0) {
            val x = -b.toDouble() / (2 * a)
            println("Phương trình có nghiệm kép x = $x")
        } else {
            val x1 = (-b + sqrt(detal.toDouble())) / (2 * a)
            val x2 = (-b - sqrt(detal.toDouble())) / (2 * a)
            println("Phương trình có 2 nghiệm phân biệt x1 = $x1 và x2 = $x2")
        }
    }
}
