package ifood.company.controller.language

fun main(args: Array<String>) {
    var x = 1
    while (x <= 5) {
        println("valor do $x")

        x++
    }

    println("===================")

    for (numero in 1..5) {
        println("valor do $numero")
    }

    println("===================")

    val comentarios = arrayOf(
            "Olá!",
            "Vamos gente, vai ter bolo",
            "Fraze de efeito"
    )


    println("===================")

    for ((indice, comentario) in comentarios.withIndex()) {
        println("msg: $indice - $comentario")

    }
}