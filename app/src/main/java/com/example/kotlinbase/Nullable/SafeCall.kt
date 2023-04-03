package com.example.kotlinbase.Nullable

// 널 아님 단언 예시
fun main() {
    var sName = readLine()?.toString()
    println("내이름은 $sName 입니다.")

    // 위 ?. 연산자를 풀어 쓸경우 아래와 같은 식이 된다.
    var sName2 = readLine()
    if(sName2 != null) sName2.toString()
    else null

    println("내이름은 $sName 입니다.")
}