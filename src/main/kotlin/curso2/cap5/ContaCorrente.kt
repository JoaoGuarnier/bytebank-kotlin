package curso2.cap5

class ContaCorrente(titular: String, numero: Int): Conta(
    titular = titular,
    numero = numero) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        this.sacar(valorComTaxa)
    }

}