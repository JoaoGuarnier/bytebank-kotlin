package cap3_4

class Conta {

    var titular: String = ""
    var numero: Int = 0
    private var saldo: Double = 0.0

    fun getSaldo(): Double {
        return this.saldo
    }

    fun setSaldo(saldo: Double) {
        this.saldo = saldo
    }


    fun sacar(valor: Double) {

        if (valor <= this.saldo) {
            this.saldo -= valor
            println("Saque realizado, saldo atual: ${this.saldo}")
        } else {
            println("Saldo insuficiente")
        }

    }

    fun depositar(valor: Double) {
        this.saldo += valor
        println("Deposito realizado, saldo atual: ${this.saldo}")
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