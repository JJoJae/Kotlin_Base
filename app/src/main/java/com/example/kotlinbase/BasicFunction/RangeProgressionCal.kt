package com.example.kotlinbase.BasicFunction

fun main() {
    /* 범위 연산자 */
    val nTwoDigits = 10..99 // 범위 연산자
    println("아무 숫자 입력 : ") // 범위 안에 들어가는지 확인
    val nInputNum1  = readLine()!!.toInt()
    println("결과1 : ${nInputNum1 in nTwoDigits}") // 범위 안에 들어가는지 확인

    val sThreeChars = "abc" .. "xyz"
    println("결과2: ${"zzz" in sThreeChars}") // 스트링 비교 가능

    val nTwoDigitsWithOut99 = 10 until 99
    println("결과3 : ${99 in nTwoDigitsWithOut99}") // 범위 안에 들어가는지 확인

    val nDownTo = 10 downTo 1   // 10 부터 내려감
    println("결과4 : ${5 in nDownTo}") // 범위 안에 들어가는지 확인

    val nStep = 1..10 step 3    // 1, 4, 7, 10
    println("결과5 : ${5 in nStep}") // 범위 안에 들어가는지 확인

    val nDownToStep = 15 downTo 8 step 2    // 15, 13, 11, 9(downTo, step 동시 사용 가능)
    println("결과5 : ${9 in nStep}") // 범위 안에 들어가는지 확인

    println("결과6 : ${"Hello World".substring(1..4)}") // subString함수에 사용
}