// Program Caesar Chiper
fun main(args: Array<String>) {
// Program ini mengenkripsi sebuah input text String yang diberikan kedalam karakter yang dinaikan atau diturunkan.
    val s = "jkdhuisndndwuiuiqwnd"
    println("Original message: $s")
    var message = ""
    var shift = 1
// loop
    for (c in s) {
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()) {
            i -= 26
        }
        val char = i.toChar()
        message += char
    }
    println("Encrypted message: $message")
}