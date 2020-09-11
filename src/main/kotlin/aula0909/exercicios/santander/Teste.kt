package aula0909.exercicios.santander

import java.time.LocalDate

fun main() {
    val cliente = Cliente(1,"Allan", "1", 1)
    val contaCorrente = ContaCorrente(cliente, 1000.0)
    val contaPoupanca = ContaPoupanca(cliente, 1.0)
    contaCorrente.depositar(50.0)
    println(contaCorrente.consultarSaldo())
    contaCorrente.sacar(500.0)
    println(contaCorrente.consultarSaldo())
    contaCorrente.depositar(Cheque(2000.0, "banco", LocalDate.now()))
    println(contaCorrente.consultarSaldo())
    println()
    contaPoupanca.depositar(50.0)
    println(contaPoupanca.consultarSaldo())
    contaPoupanca.sacar(100.0)
    println(contaPoupanca.consultarSaldo())
    contaPoupanca.recolherJuros()
    println(contaPoupanca.consultarSaldo())
}