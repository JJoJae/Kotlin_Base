package com.example.kotlinbase.BasicGrammar

import java.util.*

/* 배열 정의 */
fun main() {
    val aEmpty = emptyArray<String>()
    val aTest1 = arrayOf("Hellow", "World")
    val aTest2 = arrayOf(1, 3, 5, 7)

    println("aEmpty 배열 갯수 : " + aEmpty.size)
    println("aTest1 배열 갯수 : " + aTest1.size)
    println("aTest2 배열 갯수 : " + aTest2.size)

    val aLamda = Array(5, {i -> i*2})   // 크기가 5인 짝수형 람다식 배열 표현
    println("aLamda: ${Arrays.toString(aLamda)}")
}