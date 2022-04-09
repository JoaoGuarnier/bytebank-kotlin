package curso2.cap1_2

fun main() {

    val alex: Funcionario = Funcionario(
        nome = "Alex",
        cpf = "321.123.321-22",
        salario = 5500.0
    )

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

    println("nome ${teodoro.nome}")
    println("cpf ${teodoro.cpf}")
    println("salario ${teodoro.salario}")
    println("senha ${teodoro.senha}")
    println("plr ${teodoro.plr}")
    println("bonificacao ${teodoro.bonificacao}")





}