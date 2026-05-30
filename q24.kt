class File(var name: String) {
    var permissions: String = ""
}

fun buildFile(filename: String): File {
    return File(filename)
        .apply {
            permissions = "Read/Write"
        }
        .also {
            println("File $filename created")
        }
}

fun main() {
    val file = buildFile("notes.txt")

    println("Name: ${file.name}, Permissions: ${file.permissions}")
}
