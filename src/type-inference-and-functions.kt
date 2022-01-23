fun  main() {
    // type inference
    var a = 1234
    println(a)
    var b = 1234L
    println(b)
    var c = 12.45
    println(c)
    var d = 12.45f
    println(d)
    var e = 0xABCD
    println(e)
    var f = 0b0101010
    println(f)
    var g = true
    println(g)
    var h = 'c'
    println(h)

    // Function
    println(add(5, 6, 7))
    println(add2(5, 6, 7))
}

fun add(a: Int, b: Int, c: Int):Int {
    return a + b + c
}

fun add2(a: Int, b: Int, c: Int) = a + b + c
