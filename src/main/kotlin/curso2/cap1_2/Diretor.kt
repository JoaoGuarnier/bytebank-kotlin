package curso2.cap1_2

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

//   override val bonificacao: Double
//       get() = this.salario * 0.3

//   override val bonificacao: Double get() = this.salario * 0.3


//    override fun bonificacao(): Double {
//        return this.salario * 0.3
//    }

    override val bonificacao: Double
        get() {
            return super.bonificacao + this.salario + this.plr
        }

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}