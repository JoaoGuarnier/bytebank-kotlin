package curso1.cap5

class Conta(
    val titular: String = "",
    val numero: Int = 0,
) {



    var saldo: Double = 0.0
        private set
//        set(value) {
//            if (value > 0) {
//                field = value
//            }
//        }

//    constructor(titular: String, numero: Int) {
//        this.titular = titular
//        this.numero = numero
//    }
//
//    constructor()


    fun sacar(valor: Double) {

        if (valor <= this.saldo) {
            this.saldo -= valor
            println("Saque realizado, saldo atual: ${this.saldo}")
        } else {
            println("Saldo insuficiente")
        }

    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Deposito realizado, saldo atual: ${this.saldo}")
        }

    }

    fun transferir(contaDestino: Conta, valor: Double): Boolean {

        if (valor <= this.saldo) {
            this.saldo -= valor
            contaDestino.depositar(valor)
            println("R$$valor transferido de ${this.titular} para ${contaDestino.titular}")
            return true
        }
        println("Saldo insuficiente para transferencia")
        return false
    }



}