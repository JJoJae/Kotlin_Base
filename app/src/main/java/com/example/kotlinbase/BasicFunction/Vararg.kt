package com.example.kotlinbase.BasicFunction

/* 파라미터 개수 정해지지 않을 경우 */
fun printSort(vararg nNumbers: Int) {
    nNumbers.sort()
    println("정렬 결과 : ${nNumbers.contentToString()}")
}

/* 디폴트값 + vararg 조합 일 경우 */
fun printSort2(sString: String = "", vararg nNumbers: Int) { println("printSort2()함수 정상 호출") }

/* vararg + 디폴트값 조합 일 경우 */
fun printSort3(vararg nNumbers: Int, sString: String = "") { println("printSort3()함수 정상 호출") }

/* vararg의 오버로딩 해소 */
fun printSort4(vararg nNumbers: Int) { println("printSort4()함수 정상 vararg 호출") }          // 함수1
fun printSort4(nA: Int, nB: Int, nC: Int) { println("printSort4()함수 정상 nA, nB, nC 호출") } // 함수2

fun main() {
    printSort(5, 3, 1, 2, 4)

    // 배열 넘기기
    val arrNumbers = intArrayOf(5, 3, 1, 2, 4)
//    printSort(arrNumbers) // 그냥 넘길 시 오류 발생
    printSort(*arrNumbers) // 반드시 스프레드 연산자 사용
    println(arrNumbers.contentToString()) // 얕은복사가 이뤄져 원본에 영향 안미친다.
    printSort(8, *arrNumbers, 7) // 섞어 사용가능

    // 디폴트값 + vararg 조합 일 경우 vararg을 이름 붙은 파라미터 방식 사용 하지 않을 때 오류 발생
//    printSort2(5, 3, 1, 2, 4)
    printSort2(nNumbers = *intArrayOf(5, 3, 1, 2, 4))

    // vararg + 디폴트값 조합 일 경우 디폴트값을 이름 붙은 파라미터 방식 사용 하지 않을 때 오류 발생
//    printSort3(5, 3, 1, 2, 4, "!")
    printSort3(5, 3, 1, 2, 4, sString = "!")

    // vararg 오버로딩 시 덜구체적인 함수 취급
    printSort4(1, 2, 3) // 함수2 호출
    printSort4(1, 2)     // 함수1 호출
}
