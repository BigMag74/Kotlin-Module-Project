class Archive(val name: String): Menu() {
    private val notes: ArrayList<Note> = ArrayList()
    override var size = 0
    override fun add() {
        println("Введите название новой заметки")
        val name = scanName()
        val note = Note(name)
        note.add()
        notes.add(note)
        val size = mutableMapToShow.size
        mutableMapToShow[size] = { println("${size - 1}. Открыть заметку: $name") }
        this.size++
    }

    override fun get(index: Int): Note {
        return notes[index]
    }

    override val mutableMapToShow = mutableMapOf<Int, () -> Unit>()
    init {
        mutableMapToShow[0] = { println("Меню заметок:") }
        mutableMapToShow[1] = { println("0. Выход") }
        mutableMapToShow[2] = { println("1. Создать заметку") }
    }

}