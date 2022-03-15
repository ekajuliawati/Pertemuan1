// Penerapan String
fun main(args: Array<String>) {
// Kemunculan karakter dalam analisis kalimat
// string yang ingin kita analisis
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather, Wash, and Repeat."
    println(s)
    s = s.toLowerCase()
// penghitung inisialisasi
    var vowelCount = 0
    var consonantCount = 0
// definisi kelompok karakter
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"
// lingkaran utama
    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")
}