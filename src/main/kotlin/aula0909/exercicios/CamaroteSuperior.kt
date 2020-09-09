package aula0909.exercicios

class CamaroteSuperior(val valorAdicionalCamaroteSuperior: Double = 5.0) : VIP(){
    override fun imprimeValor() {
        println("R$${valor+valorAdicional+valorAdicionalCamaroteSuperior}")
    }

    override fun valor(): Double {
        return valor+valorAdicional+valorAdicionalCamaroteSuperior
    }
}