package curso2.cap5

abstract class FuncionarioAdmin(cpf: String, nome: String, salario: Double, val senha: Int):
    Funcionario(
        cpf = cpf,
        nome = nome,
        salario = salario
    ) {
    fun autentica(senha: Int): Boolean {
        if (senha == this.senha) {
            return true
        }
        return false
    }

}