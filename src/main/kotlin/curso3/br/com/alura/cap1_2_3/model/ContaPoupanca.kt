package curso3.br.com.alura.cap1_2_3.model

class ContaPoupanca(titular: Cliente, numero: Int) : Conta(
    titular = titular,
    numero = numero
) {

    override fun sacar(valor: Double) {
        if (valor <= this.saldo) {
            this.saldo -= valor
        }
    }

}