package com.example.newapp

fun giaithua(n : Int) : Int{
    var out : Int = 1
    for (i in 1 .. n){
        out *= i
    }
    return out
}
fun main(){
    var x = readln()!!.toIntOrNull() ?: 0
    if (x <= 0 ){
        println("Không có giai thừa của số âm hoặc bằng 0")
    }else{
        print(giaithua(x))
    }
    
}