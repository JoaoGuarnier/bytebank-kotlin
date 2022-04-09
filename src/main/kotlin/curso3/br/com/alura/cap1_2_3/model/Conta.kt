package curso3.br.com.alura.cap1_2_3.model

abstract class Conta(
    val titular: Cliente,
    val numero: Int,
) {

    var saldo: Double = 0.0
        protected set


    companion object Contador {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    abstract fun sacar(valor: Double)

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