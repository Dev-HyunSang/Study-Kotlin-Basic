fun main() {
    var a: Int = 123
    a = 625
    println(a)

    // nullable
    var b : Int? = null

    // 32비트 이내의 10진수 / 숫자만
    var intValue: Int = 1234
    // 64비트인 Long 타입의 10진수 / 숫자 뒤에 L
    var LongValue:Long = 1234L
    // 16진수 / 앞에 0x
    var intValueByHex: Int = 0x1af
    // 2진수 / 앞에 0b
    var intValueByBin :Int = 0b10110110
    // 실수 / Double
    var doubleValue: Double = 123.5
    var doubleValueWithExp: Double = 123.5e10
    // Float 형의 경우에는 뒤에 f(F)를 추가함. / 16비트의 float형으로 취급
    var floatValue:Float = 123.5f
    var charValue: Char = 'a'
    var koreanCharValue: Char = '가'
    // Boolean
    var booleanValue: Boolean = true
    // 문자열
    var stringValue = "One line String test"
    var multiLineStringValue = """multiline
     string
     test"""
}