package com.example.kotlinbase.BasicFunction

fun readInt(nNum: Int): Int {
    try {
        return readLine()!!.toInt()
    } catch (e: Exception) {
        return 0
    } catch (e: NumberFormatException) {
        return  nNum    // Exception이 NumberFormatException보다 상위 타입 이기 때문에 죽은코드
    } finally {
        println("Error")
    }
}

fun main() {
    println("결과 : ${readInt(12)}")
}