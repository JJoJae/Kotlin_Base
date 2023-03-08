package com.example.kotlinbase.BasicGrammar

/* 정수 타입 */
fun main() {
    val nYear = 2023
    val nBigNum = 123_456_789
    val nLongNum = 100L
    // val nIntNum: Int = 100L // Error
    val nBin = 0b10101
    val nHex = 0xF9
    val nZero = 0
    // val nZero2 = 01 // Error
    val nNeg = -10
    val nShortMin = Short.MIN_VALUE
    val nIntMax   = Int.MAX_VALUE + 1

    println("10진수형 리터럴 : $nYear")
    println("리터럴에 _ 넣기 : $nBigNum")
    println("Long타입 변환 : $nLongNum")
    println("2진수형 리터럴 : $nBin")
    println("16진수형 리터럴 : $nHex")
    println("0 리터럴 : $nZero")
    println("단항 음수 연산자 : $nNeg")
    println("Short 정수 타입 최솟값 : $nShortMin")
    println("Int 정수 타입 최댓값 : $nIntMax")
}