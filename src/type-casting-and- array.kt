fun main() {
    var a: Int = 54321
    println(a)
    // 명시적 형변환(explicit type casting)
    var b: Long = a.toLong()
    println(b)

    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5)
    intArr[2] = 8
    println(intArr[4])
}