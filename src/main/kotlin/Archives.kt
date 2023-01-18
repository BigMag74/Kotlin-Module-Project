class Archives : Menu() {
    private val archives: ArrayList<Archive> = ArrayList()
    override var size = archives.size
    override fun add() {
        println("Введите название нового архива")
        val name = scanName()
        archives.add(Archive())
        val size = mutableMapToShow.size
        mutableMapToShow[size] = { println("${size - 1}. Открыть архив: $name") }
    }

    override fun get(index: Int): Archive {
        return archives[index]
    }

    override val mutableMapToShow = mutableMapOf<Int, () -> Unit>()

    init {
        mutableMapToShow[0] = { println("Меню архивов:") }
        mutableMapToShow[1] = { println("0. Выход") }
        mutableMapToShow[2] = { println("1. Создать архив") }
    }


}