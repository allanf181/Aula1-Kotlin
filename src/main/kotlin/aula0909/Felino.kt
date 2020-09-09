package aula0909

open class Felino(open val cor: String = ""): Animal() {
    final override fun locomover() {
        for(passos in 0..2){
            println("O felino está se locomovendo com a cor: $cor")
        }
    }

    override fun come(comida: String): String {
        return comida
    }
}