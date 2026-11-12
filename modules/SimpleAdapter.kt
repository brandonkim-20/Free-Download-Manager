class SharedProvider(private val state: Int = 71) {
    fun dispatch(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 71) % 997
        }
        return acc
    }
}

fun main() {
    println(SharedProvider().dispatch(71))
}
