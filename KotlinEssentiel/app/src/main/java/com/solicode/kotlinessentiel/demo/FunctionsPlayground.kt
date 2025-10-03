package com.solicode.kotlinessentiel.demo
/*

fun celsiusToF(c: Double) = c * 9 / 5 + 32  // Expression body



fun greet (name: String, punctuation: String = "!") =   // Named parameters & Default values
    "Bonjour, ${name.trim()}$punctuation"
/*
greet("Ada")                          // Bonjour, Ada!
greet(name = "Alan", punctuation = "!!") // Bonjour, Alan!!
 */


fun avg (vararg numbers: Int) = numbers.average() // Vararg (variable arguments)
/*
avg(1, 2, 3, 4)  // 2.5
avg(10, 20)      // 15.0
 */


val arr = intArrayOf(2, 4, 6)
/*
avg(*arr)  // 4.0
 */


val square = { x: Int -> x * x }  // Lambdas (Anonymous functions stored in variables)

val shout: (String) -> String = { it.uppercase() }

/*
fun main() {
    repeat(3) { println("Yo") }  // Attendu (3 lignes): Yo / Yo / Yo
}
*/


fun String.sanitized() = trim().replace(Regex("\\s+"), " ")  // Extensions

//"  Hello   Kotlin  ".sanitized() // "Hello Kotlin"

*/

//------------------------------------------------------------

fun celsiusToF(c: Double) = c * 9 / 5 + 32
fun greet(name: String, punctuation: String = "!") =
    "Bonjour, ${name.trim()}$punctuation"
fun avg(vararg numbers: Int) = numbers.average()
fun String.sanitized() = trim().replace(Regex("\\s+"), " ")

val square = { x: Int -> x * x }
val shout: (String) -> String = { it.uppercase() }

fun main() {
    println(celsiusToF(0.0))       // 32.0
    println(celsiusToF(100.0))     // 212.0

    println(greet("Ada"))                          // Bonjour, Ada!
    println(greet(name = "Alan", punctuation = "!!")) // Bonjour, Alan!!

    println(avg(1, 2, 3, 4))       // 2.5
    val arr = intArrayOf(2, 4, 6)
    println(avg(*arr))             // 4.0

    println(square(5))             // 25
    println(shout("kotlin"))       // KOTLIN

    println("  Hello   Kotlin  ".sanitized()) // Hello Kotlin
}



