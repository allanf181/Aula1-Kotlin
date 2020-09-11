package aula1109

interface Voador {
    fun voar()

    fun voarRapido(){
        voar()
        println("Estou voando rápido")
    }
}