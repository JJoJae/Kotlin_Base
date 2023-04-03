package com.example.kotlinbase.DefClass

// 클래스의 주생성자 표현2(주생성자를 프로퍼티로 사용 가능), 주생성자 디폴트 값 사용
class Person3(val sFirstName: String, val sFamilyName: String = "") {
    fun fullName() = "$sFirstName $sFamilyName"

    fun printFirstName() {
        // 주생성자는 프로퍼티 초기화나 init블록 밖에서 사용 가능
        println(sFirstName)
    }
}