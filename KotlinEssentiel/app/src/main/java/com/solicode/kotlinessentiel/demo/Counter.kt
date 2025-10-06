// Counter.kt
data class Counter(val count: Int = 0) {
    fun increment(): Counter = copy(count = count + 1)
}

fun main() {
    val c1 = Counter()
    val c2 = c1.increment()

    println(c1) // Counter(count=0)
    println(c2) // Counter(count=1)
}
