package curso2.cap5

class SistemaInterno {

    fun entrar(autenticavel: Autenticavel, senha: Int) {
        if (autenticavel.autentica(senha)) {
            println("SENHA CORRETA")
        } else {
            println("SENHA INCORRETA")
        }
    }


}