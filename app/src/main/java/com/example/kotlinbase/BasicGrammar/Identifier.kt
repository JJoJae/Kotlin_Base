package com.example.kotlinbase.BasicGrammar

/* 식별자 */
fun main() {
    val nAge     = 32
    val nAge2    = 31
    val TEST_JJY = 30
    // val 2nAge    = 31 // Error
    // val fun      = 29 // Error
    // val $        = 28 // Error
    var `fun`    = 29

    println("nAge = $nAge")
    println("nAge2 = $nAge2")
    println("TEST_JJY = $TEST_JJY")
    println("`fun` = $`fun`")
}