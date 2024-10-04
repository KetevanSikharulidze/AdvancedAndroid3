package com.example.advancedandroid3

open class Parent(private var name :String, protected val age : Int){
//    var name :String = ""

    open fun details(){
        println("name: $name \nage: $age")
    }
}

class Child(name: String, age: Int, val height: Double): Parent(name,age){
    override fun details(){
        super.details()
        println("height: $height")
    }
}

fun main(){
    val p1 = Parent("luka", 7)
    p1.details()

    val c1 = Child("ana", 5, 1.50)
    c1.details()
}