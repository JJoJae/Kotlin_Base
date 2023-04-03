package com.example.kotlinbase.DefClass

class Person {
    var sFirstName: String  = ""     // 프로퍼티
    var sFamilyName: String = ""
    var iAge: Int           = 0      // var 프로퍼티
    val sGender: String     = "남성"  // val 프로퍼티

    fun fullName()  = "$sFirstName $sFamilyName"
    fun fullName2() = "${this.sFirstName} ${this.sFamilyName}"  // this 키워드 사용하여 수신 객체 참조

    fun showMe() {
        println("저의 이름은 ${fullName()} 이며 나이는 $iAge 입니다.")
    }

    //  메서드의 파라미터와 클래스의 프로퍼티의 이름이 같은경우 this 명시
    fun setName(sFirstName: String, sFamilyName: String) {
        this.sFirstName  = sFirstName
        this.sFamilyName = sFamilyName
    }
}