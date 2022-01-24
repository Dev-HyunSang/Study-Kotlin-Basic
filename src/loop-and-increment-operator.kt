fun main() {
    var a = 0

    // while에 포함된 조건식이 참인지 확인
    // 다시 while 문으로 돌아와서 조건을 확인하게 됨
    // while문이 거짓이 되는 순간 반복을 중단하고 다음 구문으로 넘어가게 됨
    // 반복시마다 a가 1씩 증가되기 때문에 0, 1, 2, 3, 4가 찍힘
    while(a < 5) {
        // 참이라면 while에 따르는 구문을 1회 수행
        println(a++)
    }
    println("==============")
    var b = 0
    // 해당 구문 내에서 증가된 값을 즉시 반영하기 때문에 증가가 먼저 된 후 화면에 출력하게 됨.
    while (b < 5) {
        println(++b)
    }
    println("==============")
    var c = 0
    do {
        println(a++)
    }while (a < 5)
    println("==============")
    for(i in 0..9) {
        println(i)
    }
    println("==============")
    // 3씩 증가 되었음을 확인할 수 있음.
    for(i in 0..9 step 3) {
        println(i)
    }
    println("==============")
    // 9에서 0까지 1씩 감소하며 반복되게 됨.
    // step을 붙이면 단계를 변경할 수 있음.
    for(i in 9 downTo 0) {
        println(i)
    }
    println("==============")
    // for문에서는 char 자료형을 사용할 수 있음.
    for(i in 'a'..'e'){
        println(i)
    }
}