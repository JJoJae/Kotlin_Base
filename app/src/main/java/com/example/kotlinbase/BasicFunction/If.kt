package com.example.kotlinbase.BasicFunction

fun max(nNumber1: Int, nNumber2: Int): Int {
    if(nNumber1 > nNumber2) return nNumber1
    else return  nNumber2
}

fun main() {
    println("누가 더 클까?  ${max(2, 3)}")
}