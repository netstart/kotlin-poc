package ifood.company.controller.language

fun main(args: Array<String>) {

    var nomes = arrayOf("Clayton", "Daniela", "Catherine", "Sophia")

    println(nomes)
    println(nomes[0])
    println(nomes[1])
    println(nomes[2])

    // println(nomes[3])


    nomes[0] = "Clayton K. N. Passos"
    println(nomes[0])


    var numeros = arrayOf(0, 1, 2, 3, 6, 9, 15)
    println(numeros[3])


    var misturado = arrayOf(0, 1, 2, "Clayton", 6, 9, "Passos")
    println(misturado[3])

    println(misturado[3].javaClass)

    println(misturado[2].javaClass)

}