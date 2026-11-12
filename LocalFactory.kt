class LiteController(private val state: Int = 18) {
    fun render(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 18) % 997
        }
        return acc
    }
}

fun main() {
    println(LiteController().render(18))
}
