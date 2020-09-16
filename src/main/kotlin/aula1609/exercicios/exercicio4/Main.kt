package aula1609.exercicios.exercicio4

fun main() {
    class Algo(marca: String, modelo: String) : Peca(marca, modelo) {
        override fun retirada() {
            TODO("Not yet implemented")
        }

        override fun toString(): String {
            return "$marca $modelo"
        }
    }

    val algo1 = Algo("marca", "m1")
    val algo2 = Algo("marca", "m2")

    val guardaVolumes = GuardaVolumes()
    guardaVolumes.mostrarPecas()
    val n = guardaVolumes.guardarPecas(listOf(algo1,algo2))
    println(n)
    guardaVolumes.mostrarPecas()
    guardaVolumes.mostrarPecas(n)
    guardaVolumes.devolverPecas(n)
    guardaVolumes.mostrarPecas()
}