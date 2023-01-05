import java.util.*
fun main() {
    val archives = Archives()
    val scanner = Scanner(System.`in`)

    while (true) {
        archives.show(archives.mutableMapToShow)
        var digit = archives.scan(archives.size)
        if (digit == -1)
            continue
        if (digit == 0) {
            break
        }
        if (digit == 1) {
            println("Введите название нового архива")
            val name = scanner.nextLine()
            archives.add(Archive(name))
            continue
        }
        if (digit > 1){
            val archive: Archive = archives.getArchive(digit - 2)
            println("Открываю архив ${archive.name}")
            while(true){
                archive.show(archive.mutableMapToShow)
                digit = archive.scan(archive.size)
                if (digit == -1)
                    continue
                if (digit == 0) {
                    break
                }
                if (digit == 1) {
                    println("Введите название новой заметки")
                    val name = scanner.nextLine()
                    val note = Note(name)
                    println("Введите содержимое новой заметки")
                    val content = scanner.nextLine()
                    note.content = content
                    archive.add(note)
                    continue
                }
                if(digit > 1){
                    val note: Note = archive.notes[digit-2]
                    println("Открываю заметку ${note.name}")
                    println(note.content)
                    println()
                    continue
                }
            }
        }
    }
}






