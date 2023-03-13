package com.example.kotlinbase.BasicFunction

fun sayHello(sName: String) {
    val sMsg =
        if (sName.isNotEmpty()) "Hello, $sName"
        else throw IllegalArgumentException("Empty name")

    println(sMsg)
}

fun main() {
//    sayHello("") // 비워 있을경우 예외처리
    sayHello("개꿀떡") // 정상 처리
}