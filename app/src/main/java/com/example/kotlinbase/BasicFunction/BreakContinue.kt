package com.example.kotlinbase.BasicFunction

fun main() {
    var nNum: Int

    while (true) {
        nNum = readLine()!!.toInt()

        if(nNum in 10 .. 99) break
        else {
            println("두자리수 찾기 시도 중...")
            continue
        }
    }

    println("두자리수 찾기 완료")
}