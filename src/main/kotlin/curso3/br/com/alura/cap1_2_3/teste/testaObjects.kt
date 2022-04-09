package curso3.br.com.alura.cap1_2_3.teste

import curso3.br.com.alura.cap1_2_3.model.*

fun main() {

    val alex = Cliente(
        nome = "Alex",
        cpf = "222.555.666-88",
        senha = 2211,
        endereço = Endereco(
            logradouro = "Rua Vergueiro"
        )
    )
    val contaCorrenteAlex = ContaCorrente(
        titular = alex,
        numero = 9999
    )
    contaCorrenteAlex.depositar(100.0)

    val ana: Cliente = Cliente(
        nome = "Ana",
        cpf = "888.777.666-22",
        senha = 1111
    )
    val contaPoupancaAana = ContaPoupanca(
        titular = ana,
        numero = 4553
    )
    contaPoupancaAana.depositar(100.0)

    println("Total de contas criadas ${Conta.total}")

}

fun objAnonimo() {

    val fran = object: Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "444.223.456-53"
        val senha: Int = 4444

        override fun autentica(senha: Int) = this.senha == senha
    }

    println("nome cliente ${fran.nome}")

}
