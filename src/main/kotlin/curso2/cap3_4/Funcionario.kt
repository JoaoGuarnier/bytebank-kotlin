package curso2.cap3_4

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {


    abstract val bonificacao: Double

}