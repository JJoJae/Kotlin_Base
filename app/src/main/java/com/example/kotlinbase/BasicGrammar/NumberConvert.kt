package com.example.kotlinbase.BasicGrammar

/* 수 변환 */
fun main() {
    val nNumber = 1
    val nFloat  = 1.5
    println("Byte 변환 : " + nNumber.toByte())
    println("Short 변환 : " + nNumber.toShort())
    println("Int 변환 : " + nNumber.toInt())
    println("Long 변환 : " + nNumber.toLong())
    println("Float 변환 : " + nNumber.toFloat())
    println("Double 변환 : " + nNumber.toDouble())

    val nNumber2 = 945
    println("Byte 변환 : " + nNumber2.toByte())    // 손실
    println("Short 변환 : " + nNumber2.toShort())
    println("Char 변환 : " + nNumber2.toChar())
    println("Long 변환 : " + nNumber2.toLong())

    val nFloat2 = 2.5
    println("Int 변환 : " + nFloat2.toInt()) // 소수점 손실

    val nNumber3 = 1_000_000_000_000
    println("Flat 변환 후 Long 변환 : " + nNumber3.toFloat().toLong()) // 정밀도 손실
}