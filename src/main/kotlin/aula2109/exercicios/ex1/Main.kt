package aula2109.exercicios.ex1

fun main() {
    val animais = arrayListOf("Pato", "Cachorro", "Gato")
    try {
        println(animais[3])
    } catch (e: Exception) {
        e.printStackTrace()
    }
}