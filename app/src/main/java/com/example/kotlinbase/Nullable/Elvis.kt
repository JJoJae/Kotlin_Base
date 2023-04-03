package com.example.kotlinbase.Nullable

fun sayHello(name: String?) {
    // 엘비스 연산자 사용 예시
    println("Hello, ${(name ?: "이름모름")}")
}

fun main() {
    sayHello("개꿀떡")
    sayHello(null)
}