fun main(args: Array<String>) {
    //tipe data Byte
    val minByte: Byte = -128
    val maxByte: Byte = 127 // 8bit
    //tpe data Short
    val minShort: Short = -32768
    val maxShort: Short = 32767 // 16bit
    //tipe data Int
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 // 32bit
    //tipe data Long
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807 // 64bit

    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)
}