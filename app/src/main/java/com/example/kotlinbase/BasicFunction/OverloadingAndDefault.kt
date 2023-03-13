package com.example.kotlinbase.BasicFunction

/* 오버로딩 예제 */
fun mul(nA: Int, nB: Int)          = nA * nB            // 함수1
fun mul(nA: Int, nB: Int, nC: Int) = nA * nB * nC       // 함수2
fun mul(sA: String, nB: Int)       = sA.repeat(nB)      // 함수3
fun mul(nA: Any, nB: Int)          = Array(nB) { nA }   // 함수4

fun main() {
    println("결과1 : ${mul(1, 2)}") // Int가 Any의 하위 타입이므로 함수1 호출
//    println("결과2 : ${mul(1, 2L)}") // (Int, Long) 타입을 받을 수 있는 함수가 없으므로 오류
    println("결과3 : ${mul("0", 3)}") // String이 Any의 하위 타입 이므로 함수3 호출
    println("결과4 : ${mul("0" as Any, 3)}") // as타입을 사용해 "0" 값의 타입을 캐스팅 해서 험수4 호출
}
