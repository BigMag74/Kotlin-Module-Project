class Archive(val name: String): Menu() {
    val notes: ArrayList<Note> = ArrayList()
    override var size = 0
    override fun add(a: Any) {
        notes.add(a as Note)
        val size = mutableMapToShow.size
        mutableMapToShow[size] = { println("${size - 1}. Открыть заметку: ${a.name}") }
        this.size++
    }

    override val mutableMapToShow = mutableMapOf<Int, () -> Unit>()
    init {
        mutableMapToShow[0] = { println("Меню заметок:") }
        mutableMapToShow[1] = { println("0. Выход") }
        mutableMapToShow[2] = { println("1. Создать заметку") }
    }
    fun add(note: Note){
        notes.add(note)
        val size = mutableMapToShow.size
        mutableMapToShow[size] = { println("${size - 1}. Открыть заметку: ${note.name}") }
        this.size++
    }
}