// STRING
//String merupakan array dari karakter dan bersifat immutable (bersifat statis
fun main(args: Array<String>) {
    val myName: String = "Eka Juliawati"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    println("")
    //Kita bisa menggabungkan String dengan tipe data lain dengan menggunakan operator +
    val s = "abc" + 1
    println(s + "def")

    println("")
    //Contoh kode program raw String
    var text = """
        for (c in "foo")
            print(c)
    """
    println(text)

    //Kita juga dapat menghapus spasi yang tidak diperlukan dalam raw String seperti contoh kode program berikut:
    var text1 = """
            |Tell me and I forget.
            |Teach me and I remember.
            |Involve me and I learn.
            |(Benjamin Franklin)
            """.trimMargin()
    println(text1)
}