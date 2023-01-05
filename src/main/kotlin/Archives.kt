class Archives: Menu() {
    val archives: ArrayList<Archive> = ArrayList()
    override var size = 0
    override fun add(a: Any) {
        archives.add(a as Archive)
        val size = mutableMapToShow.size
        mutableMapToShow[size] = { println("${size - 1}. Открыть архив: ${a.name}") }
        this.size++
    }

    override val mutableMapToShow = mutableMapOf<Int, () -> Unit>()
    init {
        mutableMapToShow[0] = { println("Меню архивов:") }
        mutableMapToShow[1] = { println("0. Выход") }
        mutableMapToShow[2] = { println("1. Создать архив") }
    }

//    fun add(archive: Archive){
//        archives.add(archive)
//        val size = mutableMapToShow.size
//        mutableMapToShow[size] = { println("${size - 1}. Открыть архив: ${archive.name}") }
//        this.size++
//    }
    fun getArchive(i: Int): Archive{
        return archives[i]
    }


}