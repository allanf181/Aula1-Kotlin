package aula1109.exercicio

class Contrato (override val nome: String) : Imprimivel {
    override val tipo: String = "Contrato"
    override fun imprimir() {
        println("Eu sou um contrato muito legal")
        println("Nome do arquivo: $nome | Tipo: $tipo")
    }
}