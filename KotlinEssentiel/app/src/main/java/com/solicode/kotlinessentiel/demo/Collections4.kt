package com.solicode.kotlinessentiel.demo


// Main.kt — Étape 4

fun main() {
    val m = mapOf("x" to 1)

    val v1 = m.getOrElse("y") { 0 } // défaut calculé
    val v2 = m["y"] ?: 0            // défaut constant
    val v3 = m.getValue("x")        // 1 (présent)

    println("v1=$v1, v2=$v2, v3=$v3")

    // Démo toMap et clés dupliquées : dernière valeur conservée
    val pairs = listOf("a" to 1, "a" to 9, "b" to 2)
    val toMap = pairs.toMap()
    println("toMap=$toMap") // {a=9, b=2}

    // Quand l’unicité est importante, préfère associateBy
    data class User(val id: Long, val name: String)
    val users = listOf(User(1, "Ali"), User(2, "Sara"), User(1, "Ali (dupliqué)"))
    val byId = users.associateBy { it.id }
    println("byId=$byId") // garde le dernier id=1
}



//v1=0, v2=0, v3=1
//toMap={a=9, b=2}
//byId={1=User(id=1, name=Ali (dupliqué)), 2=User(id=2, name=Sara)}


