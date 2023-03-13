package com.example.kotlinbase.BasicFunction

/* 일반 재귀 함수 */
fun factorial1(nNum: Int): Long {
    println("Number : $nNum")
    return if(nNum == 1) nNum.toLong() else nNum * factorial1(nNum - 1)
}

/* 꼬리 재귀 함수 */
tailrec fun factorial2(nNum: Int, nRun: Int = 1): Long {
    println("Number : $nNum")
    return if(nNum == 1) nNum.toLong() else nNum * factorial2(nNum - 1, nRun * nNum)
}

fun main() {
    var nNumber = readLine()!!.toInt()
    val nResult1: Long

    // 일반 재귀 함수 결과
    nResult1 = factorial1(nNumber)
    println("Factorial1: $nResult1")

    val nResult2: Long
    // 일반 재귀 함수 결과
    nResult2 = factorial2(nNumber)
    println("Factorial2: $nResult2")
}