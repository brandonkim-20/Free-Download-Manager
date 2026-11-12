class SmartWorker(private val state: Int = 40) {
    fun sync(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 40) % 997
        }
        return count
    }
}

fun main() {
    println(SmartWorker().sync(40))
}
