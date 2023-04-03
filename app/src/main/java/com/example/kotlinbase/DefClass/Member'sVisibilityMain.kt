package com.example.kotlinbase.DefClass

fun main(){
    println("----------결과 1------------")
    val p5 = Person5("꿀떡", "개")
    // println(p5.sFirstName) // 오류
    println(p5.sFullName()) // 사용가능

    println("----------결과 1------------")
    val p6 = Person6(32)
    val p7 = Person7(32)
//    val p8 = Person8(32) // 주생성자를 접근 못하게 private 사용했으므로 다른곳에서 사용시 오류 발생!
    p6.showAge()
    p7.showAge()
}