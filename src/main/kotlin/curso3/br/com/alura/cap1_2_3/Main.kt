package curso3.br.com.alura.cap1_2_3

import curso3.br.com.alura.cap1_2_3.model.Endereco


fun main() {

    val endereco = Endereco(logradouro = "Rua Julio",cep = "111.111.111-11")
    val endereco2 = Endereco(logradouro = "Rua Julio",cep = "111.111.111-11")
    println(endereco.equals(endereco2))
    println(endereco.toString())

}
