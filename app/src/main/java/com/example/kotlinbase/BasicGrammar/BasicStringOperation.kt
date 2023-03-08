package com.example.kotlinbase.BasicGrammar

/* 기본 문자열 연산 */
fun main() {
    val sHello = "Hello"
    println("문자열 길이 : ${sHello.length}")
    println("문자열 마지막인덱스 : ${sHello.lastIndex}")
    println("문자열 인덱스 값 : ${sHello[0]}")

    val sWorld = "World"
    println("문자열 +연산 : ${sHello + sWorld}")
    println("문자열 비교1 : ${sHello == sWorld}")
    println("문자열 비교2 : ${sHello != sWorld}")
    println("문자열 비교3 : ${sHello > sWorld}")
    println("문자열 유용함수1 : ${sHello.isEmpty()}")
    println("문자열 유용함수2 : ${sHello.isNotEmpty()}")
    println("문자열 유용함수3 : ${sHello.substring(1, 3)}")
    println("문자열 유용함수4 : ${sHello.startsWith("Hel")}")
    println("문자열 유용함수5 : ${sHello.endsWith("lo")}")
}