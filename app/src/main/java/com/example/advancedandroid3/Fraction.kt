package com.example.advancedandroid3

class Fraction {
    var numerator: Double = 0.0
    var denominator: Double = 0.0

    override fun equals(other: Any?): Boolean {
        if (other is Fraction){
            if(numerator == other.numerator*denominator/other.denominator){
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

}

fun main(){
    val f1 = Fraction()
    f1.numerator = 3.0
    f1.denominator = 5.0

    val f2 = Fraction()
    f2.numerator = 6.0
    f2.denominator = 10.0

    println(f1)
    println(f1 == f2)
//    f1.equals(f2)

}