package curso3.br.com.alura.cap1_2_3.teste

import curso3.br.com.alura.cap1_2_3.model.Endereco

fun main() {

    val endereco = Endereco()

    imprime(Unit)
    imprime(1)
    imprime("a")
    imprime(endereco)

}

fun imprime(valor: Any) {
    println(valor)
}
