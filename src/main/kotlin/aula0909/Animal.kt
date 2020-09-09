package aula0909

abstract class Animal(open val idade: Int = 0,open val especie: String = "") {
    open fun locomover(){

    }

    fun idade(){
        println("Animal tem idade de $idade e é especie $especie")
    }

    abstract fun come(comida: String): String
}