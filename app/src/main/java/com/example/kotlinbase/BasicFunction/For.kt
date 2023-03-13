package com.example.kotlinbase.BasicFunction

fun main() {
    val arrA = IntArray(10) {it * it}
    var nSum = 0

    for(i in arrA) {
        nSum += i
    }

    println("합계 : $nSum")

    val sString = "Hello, World"
    for(j in sString) {
        println(j)
    }
}