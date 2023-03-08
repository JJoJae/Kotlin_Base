package com.example.kotlinbase.BasicGrammar

/* 가변변수 */
fun main() {
    // 불변 변수 재대입 예시
    /*
    val nSum = 1
    nSum = nSum + 2
    */

    // 가변 변수 예시
    var nSum = 1
    nSum = nSum + 2
    println("nSum = $nSum")

    // 가변 변수 잘못된 타입 대입 예시
    /*
    var nTest = 1
    nTest = "Test"
    */

    // 복합 대입 연산 예시
    var nSum2 = 1
    nSum2 += 2
    println("nSum2 = $nSum2")

    // 연쇄 대입문 사용 불가 예시
    var a = 1
    var b = 2
    var c = 3
    // a = b = c // Error

    // 전위 후위 연산자
    var nNum = 1
    println("nNum = " + nNum++)
    println("nNum = " + ++nNum)
    println("nNum = " + --nNum)
    println("nNum = " + nNum--)
}