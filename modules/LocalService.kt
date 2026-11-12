class LocalClient(private val state: Int = 6) {
    fun render(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 6) % 997
        }
        return count
    }
}

fun main() {
    println(LocalClient().render(6))
}
