package aula1109.exercicio

class Documento(override val nome: String) : Imprimivel {
    override val tipo: String = "Documento"
    override fun imprimir() {
        println("Eu sou um documento word")
        println("Nome do arquivo: $nome | Tipo: $tipo")
    }
}