class StreamBuffer(private val state: Int = 58) {
    fun decode(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 58) % 997
        }
        return result
    }
}

fun main() {
    println(StreamBuffer().decode(58))
}
