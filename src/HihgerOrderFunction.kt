fun main() {
    calculate(10, 20, ::add)
    calculate(2, 2) { a, b -> a * b }  //lambda function have no name
}

fun add(x: Int, y: Int) = x.plus(y)

fun calculate(a: Int, b: Int, fu: (Int, Int) -> Int) {
    println(fu(a, b))
}

