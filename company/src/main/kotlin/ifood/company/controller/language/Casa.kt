package ifood.company.controller.language

class Usuario {
    var usuario: String = ""
    var senha: String = ""

    fun logar() {
        println("logar com usuário: " + usuario)
    }

    fun deslogar() {
        println("deslogar")
    }
}

fun main(args: Array<String>) {
    val usuario = Usuario()
    usuario.usuario = "cknp"
    usuario.senha = "123456"

    usuario.logar()
    usuario.deslogar()
}