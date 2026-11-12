class CoreProcessor(private val state: Int = 75) {
    fun flush(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 75) % 997
        }
        return total
    }
}

fun main() {
    println(CoreProcessor().flush(75))
}
