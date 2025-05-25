fun hightfun(x:Int, y:Int, action: (Int, Int) -> Int): Int{
    return action(x, y)
}

fun main(){
    var x = readln()!!.toIntOrNull() ?: 0
    var y = readln()!!.toIntOrNull() ?: 0
    var z = readln()!!.toIntOrNull() ?: 0

    var sum = hightfun(x, y, sum) + z
    println("result: $sum")
}
var sum: (Int, Int) -> Int = { a, b -> a + b }