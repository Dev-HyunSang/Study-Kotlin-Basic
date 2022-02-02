package main

fun main() {
    var a  = PersonV2("박보영", 1990)
    var b = PersonV2("전정국", 1197)
    var c = PersonV2("장원영", 2004)

    var d = PersonV2("이루다")
    var e = PersonV2("차은우")
    var f = PersonV2("류수정")
}


class PersonV2(val name: String, val birthYear: Int) {
    init {
        println("안녕하세요. ${birthYear}년생 ${name}님이 생성되었습니다.")
    }
    constructor(name: String): this(name, 1997) {
        println("보조 생성자가 사용되었습니다.")
    }
}