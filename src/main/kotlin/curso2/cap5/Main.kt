package curso2.cap5

import kotlin.math.log

fun main() {

    val rennan: Gerente = Gerente(
        nome = "Alex",
        cpf = "321.123.321-22",
        salario = 5500.0,
        senha = 4444
    )

    val teodoro: Diretor = Diretor(
        nome = "Teodoro",
        cpf = "555.555.555-44",
        salario = 1000.0,
        senha = 6666,
        plr = 200.0
    )

    val leon:Cliente = Cliente(
        nome = "leon",
        cpf = "222.222.222-88",
        senha = 2121
    )

    val sistema: SistemaInterno = SistemaInterno()

    sistema.entrar(rennan, 4444)
    sistema.entrar(teodoro, 6666)
    sistema.entrar(leon, 2121)




}

fun testaContasDiferentes() {
    val contaCorrente: ContaCorrente = ContaCorrente(titular = "Joao", numero = 666)
    val contaPoupanca: ContaPoupanca = ContaPoupanca(titular = "Rica", numero = 999)

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transferir(contaPoupanca, 100.0)

    println("saldo corrente apos transferir: ${contaCorrente.saldo}")
    println("saldo poupanca apos receber: ${contaPoupanca.saldo}")
}

fun testaFuncionarios() {

    val rennan: Gerente = Gerente(
        nome = "Alex",
        cpf = "321.123.321-22",
        salario = 5500.0,
        senha = 4444
    )

    val teodoro: Diretor = Diretor(
        nome = "Teodoro",
        cpf = "555.555.555-44",
        salario = 1000.0,
        senha = 6666,
        plr = 200.0
    )

    val bonificacao: CalculadoraBonificacao = CalculadoraBonificacao()
    bonificacao.registra(rennan)
    bonificacao.registra(teodoro)
    println(bonificacao.total)

}
