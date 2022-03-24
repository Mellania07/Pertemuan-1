//data string yang memuat keyword kotlin bisa dengan menggunakan raw string yang dipisahkan dengan triple quotes(""")
fun main(args: Array<String>) {
    var text = """ 
        for (c in "foo") 
            print(c) 
    """
    println(text)
}