package com.example.kotlinbase.BasicFunction

/* 디폴트 파라미터 예시 - 디폴트값은 뒤로 넣는 것이 좋다 */
fun squareArea4(nWidth: Double, nHeight: Double = 10.0): Double {
    return nWidth * nHeight
}

fun main() {
    println("Square Area1 : ${squareArea4(10.0)}")
    println("Square Area2 : ${squareArea4(15.0, 10.0)}")
}