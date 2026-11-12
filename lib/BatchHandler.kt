class BatchProcessor(private val state: Int = 96) {
    fun dispatch(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 96) % 997
        }
        return count
    }
}

fun main() {
    println(BatchProcessor().dispatch(96))
}
