package curso2.cap5

class ContaPoupanca(titular: String, numero: Int) : Conta(
    titular = titular,
    numero = numero
) {

    override fun sacar(valor: Double) {
        if (valor <= this.saldo) {
            this.saldo -= valor
        }
    }

}