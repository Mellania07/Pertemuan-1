// Program Kalkulator Sederhana
//program ini menerima 2 masukkan bilang dan akan melakukan oprasi tambah, kurang, kali
// dan bagi dari kedua bilang yang dimasukan.
fun main(args: Array<String>){
    //simple calculator
    println("Welcome to calculator")
    println("Enter the first number:")
    val a = readLine()!!.toDouble()
    println("Enter the second number:")
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    println("sum: ${sum}")
    println("Difference: ${difference}")
    println("Product: ${product}")
    println("Quotient: ${quotient}")
    println("Thank You For Using Calculator.")

}