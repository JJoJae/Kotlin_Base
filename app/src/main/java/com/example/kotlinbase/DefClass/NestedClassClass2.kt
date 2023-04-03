package com.example.kotlinbase.DefClass

class Person10(val sFirstName: String, val sFamilyName: String) {
    // "inner" 키워드가 없다면 "fullName()" 접근 불가
//    class MyName(val sDescription: String) {
//        fun showOwner() = println("내 이름은 ${fullName()} 입니다.")
//    }

    // "inner" 키워드로 "fullName()" 접근 가능
    inner class MyName(val sDescription: String) {
        fun showOwner() = println("내 이름은 ${fullName()} 입니다.")
    }
    private fun fullName() = "$sFamilyName $sFirstName"
}