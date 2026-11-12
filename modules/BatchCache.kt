class SmartBuffer(private val state: Int = 66) {
    fun sync(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 66) % 997
        }
        return acc
    }
}

fun main() {
    println(SmartBuffer().sync(66))
}
