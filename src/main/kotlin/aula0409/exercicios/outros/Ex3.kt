package aula0409.exercicios.outros

class Numeros(private val numeros: Array<Int>){
    fun multiplicar(){
        println(numeros.reduce { total, numero ->
            total * numero
        })
    }
}

fun main() {
    Numeros(intArrayOf(1,4,7).toTypedArray()).multiplicar()
}