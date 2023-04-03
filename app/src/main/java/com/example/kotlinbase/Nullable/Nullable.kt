package com.example.kotlinbase.Nullable

// 널 가능 파라미터 사용한 함수 예시
fun isOdd(iNumber: Int?): Boolean {
    // 반드시 null 값 처리
    if(iNumber == null) return false
    else return iNumber % 2 != 0

}

fun main() {
    val iNum1: Int = 11
    val iNum2: Int = 32
//    val iNum3: Int = null // ?가 없으면 널 불가
    val iNum3: Int? = null // ? 붙여 널 가능

    println(isOdd(iNum1))
    println(isOdd(iNum2))
    println(isOdd(iNum3)) // 파라미터가 널 가능이므로 사용 가능
}