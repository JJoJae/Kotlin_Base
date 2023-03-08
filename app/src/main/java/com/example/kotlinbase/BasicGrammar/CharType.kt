package com.example.kotlinbase.BasicGrammar

/* 문자 타입 Char */
fun main() {
    val sJ = 'J'
    println("Char형 표현: $sJ")

    val sTab            = '\t'
    val sNewLine        = '\n'
    val sCarriageRetun  = '\r'
    val sSingleQuote    = '\''
    val sDoubleQuote    = '\"'
    val sBackslash      = '\\'
    val sDollar         = '\$'
    println("탭 $sTab 탭")
    println("새 $sNewLine 줄")
    println("캐리지 $sCarriageRetun 리턴")
    println("$sSingleQuote 작은따옴표 $sSingleQuote")
    println("$sDoubleQuote 큰따옴표 $sDoubleQuote")
    println("백슬래쉬 : $sBackslash")
    println("달러 : $sDollar")

    val sPi = '\u03C0'
    println("16진수 파이 : $sPi")

    var sA = 'a'
    var sY = 'y'
    println("+/- 연산자 사용하여 새문자 생성 : " + sA + 7)
    println("++/-- 연산자 사용하여 새문자 생성 : " + --sY)
}