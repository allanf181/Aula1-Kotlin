package aula1809.exercicios.exercicio2

class Coca(val tamanho: Int, val preco: Double){
    override fun equals(other: Any?): Boolean {
        return this.tamanho == (other as? Coca)?.tamanho
    }
}