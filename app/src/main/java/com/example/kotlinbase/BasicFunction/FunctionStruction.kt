package com.example.kotlinbase.BasicFunction

// 'fun' 키워드, 함수명, 파라미터 및 파라미터 타입, 리턴 타입, 중괄호(함수 동작)
fun squareArea(nWidth: Double, nHeight: Double): Double {
    return nWidth * nHeight
    // 이후 죽은코드
}

fun main() {
    println("Input Width : ")
    val nWidth = readLine()!!.toDouble()

    println("Input Height : ")
    val nHeight = readLine()!!.toDouble()

    println("Square Area : ${squareArea(nWidth, nHeight)}")
}