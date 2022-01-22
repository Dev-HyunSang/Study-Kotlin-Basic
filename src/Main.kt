fun main() {
    var a: Int = 123
    a = 625
    println(a)

    // nullable
    var b : Int? = null

    // 32비트 이내의 10진수 / 숫자만
    var intValue: Int = 1234
    println(intValue)
    // 64비트인 Long 타입의 10진수 / 숫자 뒤에 L
    var LongValue:Long = 1234L
    println(LongValue)
    // 16진수 / 앞에 0x
    var intValueByHex: Int = 0x1af
    println(intValueByHex)
    // 2진수 / 앞에 0b
    var intValueByBin :Int = 0b10110110
    println(intValueByBin)
    // 실수 / Double
    var doubleValue: Double = 123.5
    println(doubleValue)
    var doubleValueWithExp: Double = 123.5e10
    println(doubleValueWithExp)
    // Float 형의 경우에는 뒤에 f(F)를 추가함. / 16비트의 float형으로 취급
    var floatValue:Float = 123.5f
    println(floatValue)
    var charValue: Char = 'a'
    println(charValue)
    var koreanCharValue: Char = '가'
    println(koreanCharValue)
    // Boolean
    var booleanValue: Boolean = true
    println(booleanValue)
    // 문자열
    var stringValue = "One line String test"
    println(stringValue)
    var multiLineStringValue = """multiline
     string
     test"""
    println(multiLineStringValue)
}