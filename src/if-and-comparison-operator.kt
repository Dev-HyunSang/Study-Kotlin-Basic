fun main() {
    var a = 7
    a = 11

    if (a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }

    doWhen(1)
    doWhen("Dimo")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")
    println("=======================")
    doWhen2(1)
    doWhen2("Dimo")
    doWhen2(12L)
    doWhen2(3.14159)
    doWhen2("Kotlin")
}
fun doWhen(a: Any){
    when(a) {
        1 -> println("점수 1입니다")
        "DiMo" -> println("디모의 코틀린 강좌입니다")
        is Long -> println("Long 타입 입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다")
    }
}

fun doWhen2(a:Any) {
    var result = when(a) {
        1 -> "정수 1입니다"
        "Dimo" -> "디모의 코틀린 강좌입니다."
        is Long -> "Long 타입 입니다"
        !is String -> "String 타입이 아닙니다"
        else -> "어떤 조건도 만족하지 않습니다"
    }
    println(result)
}