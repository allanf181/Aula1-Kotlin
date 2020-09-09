package aula0909.exercicios

open class Ingresso(val valor: Double = 50.0) {

    open fun imprimeValor(){
        println("R$$valor")
    }
}