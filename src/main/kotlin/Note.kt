data class Note(val name: String) : Menu() {
    var content: String = ""
    override val mutableMapToShow = mutableMapOf<Int, () -> Unit>()

    init {
        mutableMapToShow[0] = { println("Заметка $name:") }
        mutableMapToShow[1] = { println("Содержание заметки: $content") }
        mutableMapToShow[2] = { println("0. Выход") }
        mutableMapToShow[3] = { println("1. Изменить содержимое заметки") }
    }

    override var size: Int = 0

    override fun add() {
        println("Введите содержимое заметки")
        content = scanName()
    }

    override fun get(index: Int): Any {
        TODO("Not yet implemented")
    }
}