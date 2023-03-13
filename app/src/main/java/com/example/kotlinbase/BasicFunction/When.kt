package com.example.kotlinbase.BasicFunction

/* 일반적인 when문 */
fun numberPrint1(n: Int):String {
    return when {
        n == 0 -> "Zero"
        n == 1 || n == 2 || n == 3 -> "Small"
        n in 4..9 -> "Medium"
        n in 10..100 -> "Large"
        n !in Int.MIN_VALUE until 0 -> "Negative"
        else -> "Huge"
    }
}

/* when 조건이 동등 조건과 in 연산만 있을 경우 생략 가능 */
fun numberPrint2(n: Int):String {
    return when(n) {
        0 -> "Zero"
        1, 2, 3 -> "Small"
        in 4..9 -> "Medium"
        in 10..100 -> "Large"
        !in Int.MIN_VALUE until 0 -> "Negative"
        else -> "Huge"
    }
}

fun main() {
    println("numberPrint1() 함수 결과 : ${numberPrint1(32)}")
    println("numberPrint2() 함수 결과 : ${numberPrint1(32)}")
}