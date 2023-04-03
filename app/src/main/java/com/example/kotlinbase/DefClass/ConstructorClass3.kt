package com.example.kotlinbase.DefClass

// 클래스의 주생성자에 vararg 사용
class Room(vararg val p3: Person3) {
    fun showNames() {
        for (person in p3) println(person.fullName())
    }
}