package cap5

fun main() {

    val contaLebron: Conta = Conta()
    val contaDavis: Conta = Conta()

    contaLebron.titular = "Lebron"
    contaLebron.numero = 3322

    contaDavis.titular = "Davis"
    contaDavis.numero = 1222

    contaLebron.depositar(10.0)
    contaLebron.transferir(contaDavis,5.0)

    println(contaLebron.saldo)
    println(contaDavis.saldo)





}