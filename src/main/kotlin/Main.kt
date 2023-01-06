fun main() {
    val archives = Archives()
    start(archives)

}

fun<T:Menu> start(element: T) {
    while (true) {
        element.show(element.mutableMapToShow)
        val digit = element.scan(element.size)
        if (digit == -1)
            continue
        if (digit == 0) {
            break
        }
        if (digit == 1) {
            element.add()
            continue
        }
        if (digit > 1) {
            start(element.get(digit - 2) as Menu)
        }
    }
}







