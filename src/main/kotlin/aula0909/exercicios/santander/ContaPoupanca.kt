package aula0909.exercicios.santander

class ContaPoupanca(cliente: Cliente, var taxaDeJuros: Double) : Conta(cliente) {

    override fun sacar(valor: Double) {
        if (valor > saldo) {
            println("Saldo insuficiente")
        } else {
            saldo -= valor
        }
    }

    override fun consultarSaldo(): Double {
        return saldo
    }

    fun recolherJuros() {
        saldo *= 1 + taxaDeJuros/100
    }
}