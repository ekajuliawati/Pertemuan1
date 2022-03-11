// STRING
//String merupakan array dari karakter dan bersifat immutable (bersifat statis
fun main(args: Array<String>) {
    val myName: String = "Eka Juliawati"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    //Kita bisa menggabungkan String dengan tipe data lain dengan menggunakan operator +
    val s = "abc" + 1
    println(s + "def")
}