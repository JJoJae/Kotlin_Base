package com.example.kotlinbase.BasicFunction

import kotlin.random.Random

fun main() {
    val nRan = Random.nextInt(1, 101)

    loop@ while (true) {
        val nGuess = readLine()!!.toInt()

        val sMessage = when {
            nGuess < nRan -> "Small"
            nGuess > nRan -> "Big"
            else -> break@loop
        }
        println(sMessage)
    }
    println("Right: it's $nRan")
}