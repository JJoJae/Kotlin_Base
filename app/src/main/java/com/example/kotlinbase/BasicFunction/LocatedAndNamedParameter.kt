package com.example.kotlinbase.BasicFunction

fun square3DVolume(nWidth: Double, nLength: Double, nHeight: Double): Double {
    return nWidth * nLength * nHeight
}

fun main() {
    println("Input Width : ")
    val nW = readLine()!!.toDouble()

    println("Input Length : ")
    val nL = readLine()!!.toDouble()

    println("Input Height : ")
    val nH = readLine()!!.toDouble()

    // 위치 기반 파라미터 호출
    println("Square 3D Volume : ${square3DVolume(nW, nL, nH)}")

    // 이름 붙은 파라미터 호출
    println("Square 3D Volume : ${square3DVolume(nHeight = nH, nWidth = nW, nLength = nL)}")

    // 위치 기반 파라미터 + 이름 붙은 파라미터 호출
    println("Square 3D Volume : ${square3DVolume(nW, nHeight = nH, nLength = nL)}")
}