package cap3_4

fun main() {

    val contaLebron: Conta = Conta()
    val contaDavis: Conta = Conta()

    contaLebron.titular = "Lebron"
    contaLebron.setSaldo(0.0)
    contaLebron.numero = 3322

    contaDavis.titular = "Davis"
    contaDavis.setSaldo(0.0)
    contaDavis.numero = 1222

    contaLebron.depositar(10.0)
    contaLebron.transferir(contaDavis,5.0)

    println(contaLebron.getSaldo())
    println(contaDavis.getSaldo())





}