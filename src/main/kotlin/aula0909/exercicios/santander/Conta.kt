package aula0909.exercicios.santander

abstract class Conta (var cliente: Cliente) {

    protected var saldo: Double = 0.0

    fun depositar(valor: Double) {
        saldo += valor
    }

    abstract fun sacar(valor: Double)

    abstract fun consultarSaldo(): Double
}