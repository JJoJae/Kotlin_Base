package com.example.kotlinbase.BasicGrammar

import java.util.*

/* 배열 사용하기 */
fun main() {
    val aNumber = arrayOf(1, 3, 5, 7, 9)
    println("aNumber 배열 크기 : " + aNumber.size)
    println("aNumber 배열 마지막 인덱스 : " + aNumber.lastIndex)
    println("aNumber 배열 값 : " + aNumber[2])

    aNumber[2] = 5000
    println("aNumber 배열 값 변경 : " + aNumber[2])

    val aNumber2 = aNumber
    aNumber2[0] = 1000
    println("aNumber 배열 값도 같이 변경 : " + aNumber[0])

    val aNuber3 = aNumber.copyOf()
    aNuber3[1] = 3000
    println("aNumber 배열 값은 변경 안됨 : " + aNumber[1])
    println("aNuber3 배열 값만 변경 : " + aNuber3[1])

    // val aNumber = arrayOf("One", "Three", "Five", "Seven", "Nine") // Errors

    val aNumber4 = arrayOf(1, 3, 5, 7, 9) + 11
    val aNumber5 = arrayOf(1, 3, 5, 7, 9) + arrayOf(11, 13)
    println("aNumber4: ${Arrays.toString(aNumber4)}")
    println("aNumber5: ${Arrays.toString(aNumber5)}")

    println("배열은 ==/!= 연산자는 참조 비교 : " + (aNumber == aNumber))
    println("배열은 contentEquals함수로 값 비교 : " + aNumber.contentEquals(aNumber))

    println("배열 유용함수1 : " + aNumber.isEmpty())
    println("배열 유용함수2 : " + aNumber.isNotEmpty())
    println("배열 유용함수3-1 : " + aNumber.indexOf(9))
    println("배열 유용함수3-2 : " + aNumber.indexOf(10))
}