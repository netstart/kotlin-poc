package ifood.company.controller.language

// Máquina de café
fun main(args: Array<String>) {
    var nome: String? = null
//    println(nome.length)

    if (nome != null) {
        println(nome.length)
    }

    // operador Elvis, como no TypeScript
    println(nome?.length)

    nome = "Clayton"
    println(nome.length)

    // ? verifica se é null para então avaliar o .length
    println(nome?.length)

    // !! precisa ser peenchido, nunca pode ser null
    println(nome!!.length)

}
