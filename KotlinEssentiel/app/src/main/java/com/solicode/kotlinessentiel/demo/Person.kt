// Person.kt
class Person(val name: String, val age: Int) {
    fun isAdult(): Boolean = age >= 18
}

fun main() {
    val person1 = Person("Ali", 20)
    val person2 = Person("Sara", 16)

    println("${person1.name} est adulte ? ${person1.isAdult()}")
    println("${person2.name} est adulte ? ${person2.isAdult()}")
}
