package com.example.kotlinbase.BasicFunction

/* 변환 타입 생략 가능 - 식이 본문인 경우 */
fun squareArea2(nWidth: Double, nHeight: Double) =  nWidth * nHeight

/* 람다 함수 변환 시 원하는 값X */
fun squareArea3(nWidth: Double, nHeight: Double) =  {
    nWidth * nHeight
    // return nWidth * nHeight  // 리턴값 사용 시 에러
}

fun main() {
    println("Input Width : ")
    val nWidth = readLine()!!.toDouble()

    println("Input Height : ")
    val nHeight = readLine()!!.toDouble()

    println("Square Area2 : ${squareArea2(nWidth, nHeight)}")

    println("Square Area3 : ${squareArea3(nWidth, nHeight)}")
}