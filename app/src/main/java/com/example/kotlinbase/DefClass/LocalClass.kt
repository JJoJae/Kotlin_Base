package com.example.kotlinbase.DefClass

fun main() {
    // 지역 클래스
    class Person11(val sFirstName: String, val sFamilyName: String) {
        fun fullName() = "$sFamilyName $sFirstName"
    }

    val p11 = Person11("꿀떡", "개")
    println("내 이름은 ${p11.fullName()} 입니다.")
}

// 지역 클래스를 다른 곳에 호출 시 에러
fun subMain() {
//    val p11 = Person11("꿀떡", "개")
//    println("내 이름은 ${p11.fullName()} 입니다.")
}