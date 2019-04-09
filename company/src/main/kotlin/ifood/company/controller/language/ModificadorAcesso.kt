package ifood.company.controller.language

/*
private - Visível apenas dentro da classe
protected - Visível em sub classes
public - padrão, quando não informa, este é o utilizado
internal - restrita ao módulo
 */

open class Mamifero {
    // private, protected, public, internal
    protected var nome = "Channel"

    fun dormir() {
        println("Dormir")
    }
}

class Cat : Mamifero() {

    fun exibirNome() {
        println("Nome:  $nome")
    }

}

fun main(args: Array<String>) {
    Cat().exibirNome()
}