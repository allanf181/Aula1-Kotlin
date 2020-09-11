package aula1109.homework

class ItemVenda(private val produto: String, private val quantidade: Int, private val valor: Double): IRecebivel {
    override fun totalizarReceita(): Double {
        return quantidade * valor
    }

    override fun toString(): String {
        return "$produto $quantidade*$valor = ${totalizarReceita()}"
    }
}