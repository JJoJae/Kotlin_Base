package com.example.kotlinbase.BasicFunction

fun main() {
    /* 최상위 함수 호출 */
    printHello() // public 촤상위 함수 호출 가능
//    printName("개꿀떡") // private 최상위 함수 호출 불가능
    printAge(32) // 같은 모듈내 정의 되어 있으므로 internal 최상위 함수 호출 가능
//    printGender("남자") // 같은 모듈외 정의 되어 있으므로 internal 최상위 함수 호출 불가능
}