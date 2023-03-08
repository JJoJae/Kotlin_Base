package com.example.kotlinbase.BasicGrammar

/* 부동소수점 수 */
fun main() {
    val nPi = 3.14
    println("10진소수 형태 : $nPi")

    val nQuarter = .25
    println("10진소수의 정수부분 0생략 가능 : $nQuarter")

    val nPi100 = 0.314E3        // 0.314 * 1000
    val nPiOver100 = 3.14E-2    // 3.14 / 100
    println("거듭제곱 표현1 : $nPi100")
    println("거듭제곱 표현2 : $nPiOver100")

    val nPiF = 3.14F
    println("Float 형변환 : $nPiF")
}