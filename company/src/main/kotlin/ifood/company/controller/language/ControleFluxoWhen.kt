package ifood.company.controller.language

// Máquina de café
fun main(args: Array<String>) {
    val total = 1

    when (total) {
        1 -> println("Café puro curto")
        2 -> println("Café puro longo")
        3 -> println("Café com leite")
        else -> println("Nenhuma opção selecionada")
    }

}
