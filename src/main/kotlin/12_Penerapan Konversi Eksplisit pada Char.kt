//Penerapan Konversi Eksplisit pada Char
fun main(args: Array<String>) {
//ASCII value
    var c: Char // character
    var i: Int // nilai ordinal ASCII dari character
// konversi dari teks ke nilai ASCII
    c = 'a'
    i = c.toInt()
    println("The character $c was converted to its ASCII value of $i")
// konversi dari nilai ASCII ke teks
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")
}