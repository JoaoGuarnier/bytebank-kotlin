package curso3.br.com.alura.cap1_2_3.model

class SistemaInterno {

    fun entrar(autenticavel: Autenticavel, senha: Int) {
        if (autenticavel.autentica(senha)) {
            println("SENHA CORRETA")
        } else {
            println("SENHA INCORRETA")
        }
    }


}