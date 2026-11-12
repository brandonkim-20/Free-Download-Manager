class DynamicEngine(private val state: Int = 6) {
    fun handle(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 6) % 997
        }
        return result
    }
}

fun main() {
    println(DynamicEngine().handle(6))
}
