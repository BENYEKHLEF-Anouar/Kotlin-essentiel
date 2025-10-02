package com.solicode.kotlinessentiel.demo

// --- 1) levelLabel using when ---
fun levelLabel(count: Int): String = when {
    count < 0 -> "Invalide"
    count == 0 -> "Début"
    count in 1..9 -> "Bas"
    count in 10..99 -> "Moyen"
    else -> "Élevé"
}

// --- 2) sum0to using range ---
fun sum0to(n: Int): Int {
    require(n >= 0) // sécurité
    var sum = 0
    for (i in 0..n) sum += i
    return sum
}

// version fonctionnelle alternative
fun sum0toFunctional(n: Int) = (0..n).sum()

// --- 3) Demonstration of val / var + type inference + string templates ---
fun main() {
    // val = immuable
    val appName = "HelloCounter"
    val versionCode = 1

    // var = mutable
    var count = 0
    var userName: String? = null // nullable

    println("App: $appName (#$versionCode)")
    println("Initial count = $count")

    // mise à jour du count
    count += 5
    println("Updated count = $count")

    // Using levelLabel function
    println("Level for count $count = ${levelLabel(count)}")
    println("Level for -3 = ${levelLabel(-3)}")
    println("Level for 0 = ${levelLabel(0)}")
    println("Level for 50 = ${levelLabel(50)}")

    // Using sum0to
    println("Sum from 0 to 10 = ${sum0to(10)}")
    println("Sum from 0 to 10 (functional) = ${sum0toFunctional(10)}")

    // Collections & ranges
    val tags = listOf("kotlin", "compose", "android")
    for (t in tags) println("Tag: $t")
    for ((i, t) in tags.withIndex()) println("$i → $t")

    // Functional transformations
    val filtered = tags.map { it.uppercase() }.filter { it.startsWith("A") }
    println("Filtered tags: $filtered")

    // Simple condition with if expression
    val status = if (count > 0) "OK" else "VIDE"
    println("Status: $status")
}
