// Program Sandi Morse
fun main(args: Array<String>) {
// Program ini membaca atau mengkonversi sebuah input text String berbentuk sandi Morse kedalam plain teks.
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message: $s")
    var message = ""
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
        val characters = s.split(" ")
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        if (index != -1) {
            message += alphabetChars[index]
        }
    }
    println("The decoded message: $message")
}