package com.example.kotlinbase.DefClass

fun main() {
    println("----------결과 1------------")
    val id  = Person9.Id("꿀떡", "개")
    val id2 = Person9.Id2("개꿀떡")
    val p9  = Person9(id, id2,32)
    p9.showMe()

    println("----------결과 2------------")
    val p10    = Person10("꿀떡", "개")
    val myname = p10.MyName("내 이름")
    myname.showOwner()
}