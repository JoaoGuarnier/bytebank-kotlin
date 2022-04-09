package curso3.br.com.alura.cap1_2_3.model

class ContaCorrente(titular: Cliente, numero: Int): Conta(
    titular = titular,
    numero = numero) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        this.sacar(valorComTaxa)
    }

}