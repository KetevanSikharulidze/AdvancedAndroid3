package com.example.advancedandroid3

fun main(){
    myFun(5,10.2)
    val x = myFun2(3) + 2.2
    println(x)
}

fun myFun(a: Int, b: Double){
    println("a = $a, b = $b")
}

fun myFun2(a: Int): Double {
    return a.toDouble()
}