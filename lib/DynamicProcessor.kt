class AsyncWorker(private val state: Int = 62) {
    fun decode(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 62) % 997
        }
        return acc
    }
}

fun main() {
    println(AsyncWorker().decode(62))
}
