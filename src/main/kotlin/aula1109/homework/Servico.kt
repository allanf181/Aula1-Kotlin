package aula1109.homework

class Servico(private val descricao: String, private val horas: Int, private val precoHora: Double): IRecebivel {
    override fun totalizarReceita(): Double {
        return horas * precoHora
    }

    override fun toString(): String {
        return "$descricao $horas*$precoHora = ${totalizarReceita()}"
    }
}