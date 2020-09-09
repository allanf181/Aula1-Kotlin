package aula0909.exercicios

open class VIP(val valorAdicional: Double = 15.0) : Ingresso() {
    override fun imprimeValor() {
        println("R$${valor+valorAdicional}")
    }

    open fun valor(): Double {
        return valor+valorAdicional
    }
}