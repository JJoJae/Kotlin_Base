package com.example.kotlinbase.DefClass

// 클래스의 주생성자 표현
class Person2(sFullName: String) {
    val sFirstName: String
    val sFamilyName: String

    // 주생성자는 프로퍼티 초기화나 init블록 밖에서 사용 불가
    // sFullName = ""
    // fun readFullName() = println("주생성자는 $sFullName 입니다.")

    // 초기화 블록
    init {
        val sName = sFullName.split(" ")
        if(sName.size != 2) {
            // 초기화 블록에서는 return 사용불가
            // return
            throw IllegalArgumentException("유효하지 않는 성명입니다.")
        } else {
            sFirstName  = sName[0]
            sFamilyName = sName[1]
        }
    }
}