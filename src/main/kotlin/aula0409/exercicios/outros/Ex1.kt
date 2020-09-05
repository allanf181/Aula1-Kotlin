package aula0409.exercicios.outros

class Fatorial(private val numero: Int){
    fun calcular(){
        var fatorial = 1
        for (i in 1..numero) {
            fatorial *= i
        }
        println(fatorial)
    }
}

fun main() {
    Fatorial(0).calcular()
}