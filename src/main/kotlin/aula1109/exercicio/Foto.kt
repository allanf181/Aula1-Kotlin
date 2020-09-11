package aula1109.exercicio

class Foto(override val nome: String) : Imprimivel {
    override val tipo: String = "Foto"
    override fun imprimir() {
        println("Eu sou uma selfie")
        println("Nome do arquivo: $nome | Tipo: $tipo")
    }
}