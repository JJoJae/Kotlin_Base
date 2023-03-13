package com.example.kotlinbase.BasicFunction

fun main() {
    // 같은 패키지내 함수 호출
    printHelloWorld()

    // 다른 패키지의 전체이름 사용한 함수 호출
    com.example.kotlinbase.BasicFunction2.printHelloName("개꿀떡")
}