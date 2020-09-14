package aula1409.exercicio2

class Fatura(val numero: Int, val descricao: String, quantidade: Int, preco: Double) {
    val quantidade: Int = if (quantidade > 0) quantidade else 0
    val preco: Double = if (preco > 0) preco else 0.0

    fun getTotalFatura(): Double{
        return preco * quantidade
    }
}