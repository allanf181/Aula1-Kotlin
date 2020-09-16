package aula1609.exercicios.exercicio4

class GuardaVolumes {
    private val pecas = mutableMapOf<Int, List<Peca>>()
    private var indentificador = 0

    fun guardarPecas(listaDePecas: List<Peca>): Int{
        pecas[indentificador] = listaDePecas
        return indentificador++
    }

    fun mostrarPecas(){
        println(pecas)
    }

    fun mostrarPecas(numero: Int){
        println(pecas[numero])
    }

    fun devolverPecas(numero: Int){
        pecas.remove(numero)
    }
}