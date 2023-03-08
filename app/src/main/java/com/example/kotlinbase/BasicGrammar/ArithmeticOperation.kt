package com.example.kotlinbase.BasicGrammar

/* 산술연산 */
fun main() {
    println("floorDiv함수 예시 : " + 9.floorDiv(4))
    println("mod함수 예시 : " + 9.mod(4))

    val nByte: Byte     = 1
    val nShort: Short   = 1
    val nInt: Int       = 1
    val nFloat          = 1.5f
    val nDouble         = 1.5
    println("Byte형 -연산 : " + -nByte)        // -1: Int
    println("Short형 -연산 : " + -nShort)      // -1: Int
    println("Int형 -연산 : " + -nInt)          // -1: Int
    println("Float형 -연산 : " + -nFloat)      // -1.5: Float
    println("Double형 -연산 : " + -nDouble)    // -1.5: Double
}