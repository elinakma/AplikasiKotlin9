package com.example.aplikasikotlin9

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")

    val temperature = 60
    val isHot = if (temperature > 40) "haredang" else "dingin"
    println("cuaca hari ini $isHot")

    val isUnit = println("seperti ini ya gais")
    println(isUnit)
}