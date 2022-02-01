package main

fun main() {
    var a  = Person("박보영", 1990)
    var b = Person("전정국", 1197)
    var c = Person("장원영", 2004)

    a.introduce()
    b.introduce()
    c.introduce()
}

class Person(var name: String, val birthYear: Int) {
    fun introduce() {
        println("안녕하세요. ${birthYear}년생 ${name}입니다.")
    }
}