package cap2

fun main() {

    var saldo = 100.0

    verificaSaldoWhen(saldo)

}

fun verificaSaldoIf(saldo: Double) {

    if (saldo > 0.0) {
        println("Conta com valor positivo: $saldo")
    } else if (saldo == 0.0) {
        println("Conta neutra")
    } else {
        println("Conta negativada: $saldo")
    }

}

fun verificaSaldoWhen(saldo: Double) {

//    when {
//        saldo > 0.0 -> {
//            println("Conta com valor positivo: $saldo")
//        }
//        saldo == 0.0 -> {
//            println("Conta neutra")
//        }
//        else -> println("Conta negativada: $saldo")
//    }

    when {
        saldo > 0.0 -> println("Conta com valor positivo: $saldo")
        saldo == 0.0 -> println("Conta neutra")
        else -> println("Conta negativada: $saldo")
    }

}

