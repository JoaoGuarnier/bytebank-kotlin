package cap2

fun main() {

    var saldo = 0.0

    for (i in 1..3) {
        saldo+= i*10
        println(saldo)
    }

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 5 downTo 1 step 2) {
        println(i)
    }

}
