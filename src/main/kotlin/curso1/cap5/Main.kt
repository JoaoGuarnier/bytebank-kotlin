package curso1.cap5

fun main() {

    val contaLebron: Conta = Conta("Lebron", 1222)
    val contaDavis: Conta = Conta(titular = "Davis", numero = 2221)

    contaLebron.depositar(10.0)
    contaLebron.transferir(contaDavis,5.0)

    println(contaLebron.saldo)
    println(contaDavis.saldo)


    var conta: Conta = Conta()


//    loop@ for (i in 1..100) {
//        println("i $i")
//        for (j in 1..100) {
//            println("j $j")
//            if (j == 5) break@loop
//        }
//    }


}