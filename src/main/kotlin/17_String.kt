//String merupakan array dari karakter dan bersifat immutable (bersifat statis).
//Elemen suatu String dapat diakses dengan operasi indeks array contoh s[i] atau dengan menggunakan for-loop.
fun main(args: Array<String>) {
    val myName: String = "Mellania Sholawati"
    for(chr in myName){
        print(chr)
    }
    print('\n')
}