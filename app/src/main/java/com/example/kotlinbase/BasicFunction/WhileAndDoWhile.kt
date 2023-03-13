package com.example.kotlinbase.BasicFunction

/* Do - While 함수 */
fun sumNumber() {
    var nSum = 0
    var nNum: Int

    do {
        nNum = readLine()!!.toInt()
        nSum += nNum
    } while (nNum != 0)

    println("Do-While 결과 : $nSum")
}

/* While 함수 */
fun sumNumbe2() {
    var nSum = 0
    var nNum = 1

    while (nNum != 0) {
        nNum = readLine()!!.toInt()
        nSum += nNum
    }

    println("While 결과 : $nSum")
}

fun main() {
    sumNumber() // Do-While문 호출 : 반드시 한번은 반복
    sumNumbe2() // While문 호출 : 조건 먼저 검사
}