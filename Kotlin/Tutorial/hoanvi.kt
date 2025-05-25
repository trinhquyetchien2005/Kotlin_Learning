fun hoanvi(arr: Array<Int>){
    val temp = arr[0]
    arr[0] = arr[1]
    arr[1] = temp
}

fun main(){
    println("Nhập x: ")
    var x: Int = readLine()!!.toInt()
    println("Nhập y: ")
    var y: Int = readLine()!!.toInt()

    val arr = arrayOf(x, y)
    hoanvi(arr)
    println("x = ${arr[0]} and y = ${arr[1]}")
}