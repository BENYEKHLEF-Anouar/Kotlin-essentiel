package com.solicode.kotlinessentiel.demo


// Main.kt — Étape 2

fun main() {
    val tags = listOf("Kotlin", "Compose", "Flow")

    // for-each simple
    for (t in tags) println("tag=$t")

    // index + valeur
    for ((i, t) in tags.withIndex()) println("$i → $t")

    // Déstructuration Map
    val counts = mapOf("done" to 3, "todo" to 5)
    for ((k, v) in counts) println("$k = $v")

    // Version fonctionnelle
    tags.forEach { println("• $it") }
}

//tag=Kotlin
//tag=Compose
//tag=Flow
//0 → Kotlin
//1 → Compose
//2 → Flow
//done = 3
//todo = 5
//• Kotlin
//• Compose
//• Flow




