package com.example.kotlinbase.BasicFunction

/* 디폴트가 public 최상위 함수 */
fun printHello() = println("Hello World!!")

/* private 최상위 함수 */
private  fun printName(sName: String) = println("My Name is $sName")

/* internal 최상위 함수 */
internal fun printAge(nAge: Int) = println("My Age is $nAge")