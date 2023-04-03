package com.example.kotlinbase.DefClass

// 부생성자 예시
class Person4 {
    val sFirstName: String
    val sFamilyName: String

    // 부생성자 형태
    constructor(sFirstName: String, sFamilyName: String) {
        this.sFirstName  = sFirstName
        this.sFamilyName = sFamilyName
    }

    // 부생성자에는 val/var 사용시 오류
    // constructor(val sFullName: String) {
    constructor(sFullName: String) {
        val sName = sFullName.split(" ")
        if(sName.size != 2) {
            throw IllegalArgumentException("유효하지 않는 성명입니다 : $sFullName")
        } else {
            sFirstName  = sName[0]
            sFamilyName = sName[1]
        }
    }
}