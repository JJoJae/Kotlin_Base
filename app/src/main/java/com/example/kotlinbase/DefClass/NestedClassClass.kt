package com.example.kotlinbase.DefClass

class Person9 (val id: Id, val id2: Id2, val iAge: Int) {
    // 내포된 클래스
    class Id(val sFirstName: String, val sFamilyName: String)
    fun showMe() = println("내 이름은 ${id.sFamilyName} ${id.sFirstName}이고 나이는 $iAge 입니다.")

    class Id2(private val sFullName: String)
//    fun showFullName() = println("내 이름은 ${id2.sFullName}입니다.") // 멤버변수 가시성 지정 가능(sFullName 접근 불가)
}