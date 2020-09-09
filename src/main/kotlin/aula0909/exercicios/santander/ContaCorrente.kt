package aula0909.exercicios.santander

class ContaCorrente(cliente: Cliente, var limiteChequeEspecial: Double) : Conta(cliente) {

    override fun depositar(valor: Double) {
        saldo += valor
    }

    fun depositar(cheque: Cheque) {
        saldo += cheque.valor
    }

    override fun sacar(valor: Double) {
        if (valor < saldo + limiteChequeEspecial) {
            println("Saldo insuficiente")
        } else {
            saldo -= valor
        }

    }

    override fun consultarSaldo(): Double {
        return saldo
    }
}