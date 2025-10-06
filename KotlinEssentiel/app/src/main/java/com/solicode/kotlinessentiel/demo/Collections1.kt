package com.solicode.kotlinessentiel.demo


// Main.kt — Étape 1

fun main() {
    val tags: List<String> = listOf("android", "kotlin", "compose") // immuable
    val bag: MutableList<Int> = mutableListOf(1, 2, 2)              // modifiable

    val uniq: Set<String> = setOf("kotlin", "kotlin", "compose")    // {"kotlin","compose"}
    val counts: MutableMap<String, Int> = mutableMapOf("done" to 3)

    println("tags=$tags")
    println("bag avant: $bag")
    bag.add(2)
    println("bag après: $bag")
    println("uniq=$uniq")
    println("counts=$counts")
}

//tags=[android, kotlin, compose]
//bag avant: [1, 2, 2]
//bag après: [1, 2, 2, 2]
//uniq=[kotlin, compose]
//counts={done=3}
