package curso3.br.com.alura.cap1_2_3.model

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int,
    var endereço: Endereco = Endereco()
): Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}
