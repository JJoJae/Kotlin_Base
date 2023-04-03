package com.example.kotlinbase.DefClass

fun main() {
    println("----------결과 1------------")
    val p2 = Person2("꿀떡 개") // 새 인스턴스 생성
    println(p2.sFirstName)

    println("----------결과 2------------")
    val p3 = Person3("꿀떡", "개") // 새 인스턴스 생성
    p3.printFirstName()

    println("----------결과 3------------")
    val r = Room(Person3("꿀떡"), Person3("꿀떡", "개")) // 주생성자에 vararg 있을 경우
    r.showNames()

    println("----------결과 4------------")
    val p4_1 = Person4("꿀떡", "개")
    val p4_2 = Person4("꿀떡 개")
    println(p4_1.sFamilyName)
    println(p4_2.sFamilyName)
}