import java.util.Scanner

abstract class Menu {

    abstract val mutableMapToShow: MutableMap<Int, () -> Unit>
    abstract var size: Int
    abstract fun add()
    abstract fun get(index: Int): Any
    private val scanner: Scanner
        get() = Scanner(System.`in`)

    fun show(ref: MutableMap<Int, () -> Unit>) {
        for ((K, V) in ref) {
            ref[K]?.invoke()
        }
    }

    fun scan(size: Int): Int {
        val digit: Int
        try {
            digit = scanner.nextLine().toInt()
        } catch (nfe: NumberFormatException) {
            println("Ошибка ввода. Введите, пожалуйста цифру")
            return -1
        }
        if ((digit > size + 1) or (digit < 0)) {
            println("Ошибка ввода. Пункт меню под данной цифрой отсуствует")
            return -1
        }
        return digit
    }

    fun scanName(): String {
        return scanner.nextLine()
    }


}

