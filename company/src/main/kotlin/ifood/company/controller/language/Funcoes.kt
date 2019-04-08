package ifood.company.controller.language


fun main(args: Array<String>) {
    exibirMensagem();
    exibirMensagem("Olá mundo!")
    exibirMensagemInterpolacao("Clayton", 39)
    exibirSoma(10, 29)
}

fun exibirMensagem() {
    println("Aqui vamos exibir uma mensagem fixa")
}

fun exibirMensagem(msg: String) {
    println("Vamos exibir uma msg com parâmetro" + msg)
}

fun exibirMensagemInterpolacao(nome: String, idade: Int) {
    println("Exibindo nome com interpolação, nome: $nome idade: $idade")
}

fun exibirSoma(a: Int, b: Int) {
    println("Soma de A + B = " + (a + b))
    println("Soma de A + B = " + soma(a, b))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}