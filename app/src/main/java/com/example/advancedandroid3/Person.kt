package com.example.advancedandroid3

interface Activity {
    fun amountProblem()
    fun printAbout() : String
}

class Group(
    private val studentsAmount: Int,
    private val subject: String,
    private val deskAmounts: Int ): Activity{

    override fun amountProblem() {
        if (studentsAmount > deskAmounts || studentsAmount <= 0) {
            println("problem")
        } else
            println("no problem")
    }

    override fun printAbout(): String {
        return "student amount = $studentsAmount" +
                "\nsubject name = $subject" +
                "\ndesk amount is $deskAmounts"
    }

}

fun main(){
    val group306 = Group(15,"Android", 3)
    group306.amountProblem()
    println(group306.printAbout())
}