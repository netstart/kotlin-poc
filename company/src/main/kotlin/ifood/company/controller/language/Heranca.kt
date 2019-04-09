package ifood.company.controller.language

// sem open, você irá ter o erro This type is final, so it cannot be inherited from, é necessário open
open class Animal {
    open fun dormir(): Animal {
        print("Animal dormindo")
        return this;
    }

    fun correr(): Animal {
        println("Animal correndo")
        return this
    }
}

class Cao : Animal() {
    override fun dormir(): Cao {
        super.dormir()
        println(" como um cão")
        return this;
    }

    fun latir(): Cao {
        println("Cão latindo")
        return this
    }
}

class Passaro : Animal() {
}


fun main(args: Array<String>) {
    val cao = Cao().latir().correr().dormir()
    println("")
    Passaro().correr().dormir()
}