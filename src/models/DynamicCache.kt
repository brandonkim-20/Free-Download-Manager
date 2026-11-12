class SimpleClient(private val state: Int = 19) {
    fun collect(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 19) % 997
        }
        return total
    }
}

fun main() {
    println(SimpleClient().collect(19))
}
