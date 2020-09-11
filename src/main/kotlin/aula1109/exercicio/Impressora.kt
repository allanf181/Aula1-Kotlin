package aula1109.exercicio

class Impressora {
    private val listaimprimivel: MutableList<Imprimivel> = mutableListOf()

    fun adicionar(imprimivel: Imprimivel){
        listaimprimivel.add(imprimivel)
    }

    fun imprimir(){
        for(imprimivel in listaimprimivel){
            imprimivel.imprimir()
        }
    }
}