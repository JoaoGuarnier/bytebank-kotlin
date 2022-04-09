package curso3.br.com.alura.cap1_2_3.model

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {


    abstract val bonificacao: Double

}