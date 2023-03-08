package com.example.kotlinbase.BasicType

/* 정수 타입 */
fun main() {
    val nTest1          = 1234          // 10진수 리터럴

    val nTest2          = 567_891_234   // 리터럴에 '_'로 가독성 높이기

    val nTest3: Byte    = 1             // 범위에 맞는 타입 명시
//    val nTest4: Short   = 999_999       // 범위에 안맞는 타입 시 에러
    val nTest5          = 999_999       // 자동으로 Int로 타입 추론

    val nTest6          = 100L          // 'L'을 붙여 Long 타입 추론
//    val nTest7: Int     = 100L          // Long 타입이외에 다른타입 명시시 에러

    val nTest8          = 0             // 0 표현가능
//    val nTest9          = 01            // 맨 앞에 0이고 다른숫자시 에러

    val nTest10         = -10           // 음수표현가능

    Short.MAX_VALUE                     // Short 최대값 32768
    Byte.MIN_VALUE                       // Byte 최소값 -128
}