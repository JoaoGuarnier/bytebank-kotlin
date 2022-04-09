package curso2.cap1_2

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

//   override val bonificacao: Double
//       get() = this.salario * 0.2

//   override val bonificacao: Double get() = this.salario * 0.2


//    override fun bonificacao(): Double {
//        return this.salario * 0.2
//    }

    override val bonificacao: Double
        get() {
            return super.bonificacao + this.salario
        }


    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}