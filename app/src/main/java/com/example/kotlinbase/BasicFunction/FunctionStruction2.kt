package com.example.kotlinbase.BasicFunction

// 아래 함수와 동등한 함수이다.
//fun unitExample(sName: String): Unit {
//    println("Hello, My name is $sName!!")
//}

/* 변환 타입 생략 가능 - Unit */
fun unitExample(sName: String) {
    println("Hello, My name is $sName!!")
}

fun main() {
    unitExample("개꿀떡")
}