package aula0409.exercicios.ex1

class Conta(val numero: Int, val titular: Cliente){

    var saldo: Double = 0.0

    fun deposito(dinheiro: Double){
        saldo += dinheiro
        println("Transação: deposito")
        println("Novo saldo: $saldo")
    }

    fun saque(dinheiro: Double){
        if(dinheiro <= saldo){
            saldo -= dinheiro
            println("Transação: saque")
            println("Novo saldo: $saldo")
        } else {
            println("Saldo insuficiente")
        }

    }
}