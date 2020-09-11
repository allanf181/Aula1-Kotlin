package aula1109

fun main() {
    val voadores: Array<Voador> = arrayOf(Aviao(), Pato(), SuperHomem())
    voadores.forEach { voador -> voador.voarRapido() }
}