package com.example.newapp

fun main(){
    var x? = readLine()?.toIntOrNull()?: 0
    var y? = readLine()?.toIntOrNull()?: 0
    var z? = readLine()?.toIntOrNull()?: 0

    var sum: (Int, ) -> Int = { a, b, c -> a + b + c }
    val out = sum(x, y, z)

    print(out)
}