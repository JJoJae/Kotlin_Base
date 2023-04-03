package com.example.kotlinbase.DefClass

fun showAge(p: Person) = println(p.iAge)    // 'p'는 수신객체, 프로퍼티 쓰기

// 프로퍼티 읽기
fun readAge(p: Person) {
    p.iAge = readLine()!!.toInt()
}

fun main() {
    val p = Person() // Person 클래스 인스턴스 생성

    p.sFirstName  = "꿀떡"
    p.sFamilyName = "개"
    p.iAge        = 32

    p.showMe()
}