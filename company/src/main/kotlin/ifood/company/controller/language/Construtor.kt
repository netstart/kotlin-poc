package ifood.company.controller.language

// Construtor primário
class NotaFiscal(numero: String, valor: Double) {

    var numero: String = ""
    var valor: Double = 0.0

    // initialize
    init {
        this.numero = numero
        this.valor = valor
    }


    fun toPrint() {
        println("Notafiscal: $numero valor: $valor")
    }

}

class ImpostoDeRenda {
    var valorDeclarado: Double = 0.0

    // Construtor secundário
    constructor(valorDeclarado: Double = 0.0) {
        this.valorDeclarado = valorDeclarado
    }


    fun toPrint() {
        println("Imposto de renda $valorDeclarado")
    }
}

class Pedido(val valorTotal: Double = 0.0) {

    fun toPrint() {
        println("ValorTotal do pedido $valorTotal")
    }
}

fun main(args: Array<String>) {

    NotaFiscal("ABC001", 10.5).toPrint()
    ImpostoDeRenda(22.11).toPrint()
    Pedido(33.22).toPrint()

}