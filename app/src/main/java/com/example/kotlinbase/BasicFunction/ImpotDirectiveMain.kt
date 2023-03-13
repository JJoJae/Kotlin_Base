package com.example.kotlinbase.BasicFunction

import com.example.kotlinbase.BasicFunction2.printHelloHello as printHelloHello2
import com.example.kotlinbase.BasicFunction3.printHelloHello as printHelloHello3

fun main() {
//    printHelloHello() // 그냥 호출시 오류 나오므로 별명을 지어 구분 지어주기
    printHelloHello2()  // com.example.kotlinbase.BasicFunction2 패키지의 함수 호출
    printHelloHello3()  // com.example.kotlinbase.BasicFunction3 패키지의 함수 호출
}