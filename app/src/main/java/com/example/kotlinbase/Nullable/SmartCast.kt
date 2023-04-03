package com.example.kotlinbase.Nullable

// 스마트캐스트 예시
fun sizeNumber(iNumber: Int?) = when (iNumber) {
    null               -> "NULL"
    in 0..10     -> "Small"
    in 11 .. 100 -> "Large"
    else               -> "Out of range"
}

fun main() {
    println(sizeNumber(null))
    println(sizeNumber(32))

    // 널 검사 이후에 널 검사한 변수가 변경 되었으므로 오류 발생 예시
    var sString = readLine()
    if(sString != null) {
        sString = readLine()
        // println(sString.length)
    }
}