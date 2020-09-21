package aula2109.exercicios.ex2

fun main() {
    val animais: ArrayList<String>? = arrayListOf()
    try {
        animais!!.addAll(arrayListOf("Pato", "Cachorro", "Gato"))
        try {
            println(animais[5])
        } catch (e: IndexOutOfBoundsException) {
            e.printStackTrace()
        }
    } catch (e: NullPointerException) {
        e.printStackTrace()
    }

}