package ifood.company.controller.language

// Máquina de café
fun main(args: Array<String>) {
    val total = 2

    when (total) {
        1 -> println("Café puro curto")
        2 -> {
            println("Café puro longo")
            println("e com açucar")
        }
        3, 4 -> println("Café com leite")
        5 -> println("Café com chocolate")

        else -> println("Nenhuma opção selecionada")
    }

}
