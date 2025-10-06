// GreetCheck.kt
fun greet(name: String) {
    println("Bonjour, $name")
}

fun checkAge(age: Int): String =
    if (age >= 18) "Majeur" else "Mineur"

fun main() {
    greet("Sara")
    println(checkAge(20))
}
