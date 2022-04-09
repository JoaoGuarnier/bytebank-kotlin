package curso2.cap5

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int
): Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}