package aula1109.exercicio

class Impressora {
    private val listaimprimivel: MutableList<Imprimivel> = mutableListOf()

    fun adicionar(vararg imprimiveis: Imprimivel) = listaimprimivel.addAll(imprimiveis)

    fun imprimir() {
        for(imprimivel in listaimprimivel){
            imprimivel.imprimir()
        }
    }
}