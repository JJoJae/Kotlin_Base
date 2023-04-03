package com.example.kotlinbase.DefClass

// 멤버변수의 가시성 예시
class Person5(private val sFirstName: String,
              private val sFamilyName: String) {
    fun sFullName() = "$sFirstName $sFamilyName"
}