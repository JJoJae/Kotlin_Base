package com.example.kotlinbase.DefClass

// 기본 주생성자 형태
class Person6 constructor(val iAge: Int) {
    fun showAge() = println("내 나이는 $iAge 입니다.")
}

// 기본 주생성자 형태에서 일반적으로 constructor 생략 해서 사용
class Person7(val iAge: Int) {
    fun showAge() = println("내 나이는 $iAge 입니다.")
}

// 주생성자의 가시성을 지정하게 되면 "constructor" 생략 불가능
class Person8 private constructor(val iAge: Int) {
    fun showAge() = println("내 나이는 $iAge 입니다.")
}

