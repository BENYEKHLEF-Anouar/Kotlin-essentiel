package com.solicode.kotlinessentiel.demo

// Main.kt — Étape 3

data class Todo(val id: Long, val title: String, val done: Boolean)

fun main() {
    val todos = listOf(
        Todo(1, "Étudier Kotlin", true),
        Todo(2, "Écrire UI Compose", false),
        Todo(3, "Tests", true),
        Todo(4, "Étudier Kotlin", false) // doublon de title pour distinctBy
    )

    // Filtrer + projeter
    val doneTitles: List<String> = todos.filter { it.done }.map { it.title }
    println("doneTitles=$doneTitles")

    // Sommes & comptes
    val totalDone = todos.count { it.done }
    val totalChars = todos.sumOf { it.title.length }
    val avgTitle = todos.map { it.title.length }.average()
    println("done=$totalDone, chars=$totalChars, avg=$avgTitle")

    // Tri & unicité
    val sorted = todos.sortedBy { it.title.lowercase() }
    val distinctByTitle = todos.distinctBy { it.title }
    println("sorted=${sorted.map { it.title }}")
    println("distinctByTitle=${distinctByTitle.map { it.title }}")

    // Groupement & indexation
    val byDone: Map<Boolean, List<Todo>> = todos.groupBy { it.done }
    val byId: Map<Long, Todo> = todos.associateBy { it.id }
    println("byDone keys=${byDone.keys}")
    println("byId keys=${byId.keys}")

    // Nettoyage des nulls
    val maybeIds: List<Long?> = listOf(1, null, 2)
    val ids: List<Long> = maybeIds.filterNotNull()
    println("ids=$ids")

    // Conversion personnalisée -> Map<K,V>
    val kv: Map<String, Int> = todos.associate { it.title to it.title.length }
    println("kv=$kv")
}

//doneTitles=[Étudier Kotlin, Tests]
//done=2, chars=50, avg=12.5
//sorted=[Écrire UI Compose, Étudier Kotlin, Étudier Kotlin, Tests]
//distinctByTitle=[Étudier Kotlin, Écrire UI Compose, Tests]
//byDone keys=[true, false]
//byId keys=[1, 2, 3, 4]
//ids=[1, 2]
//kv={Étudier Kotlin=14, Écrire UI Compose=17, Tests=5}