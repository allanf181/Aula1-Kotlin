package aula0409.exercicios.ex1

fun main() {
    val cliente1 =  Cliente("Allan", "Fernando")
    val cliente2 =  Cliente("Maria", "Silva")
    val conta1 = Conta(1, cliente1)
    val conta2 = Conta(2, cliente2)

    conta1.deposito(50.0)
    conta1.saque(40.0)

    conta2.deposito(50.0)
    conta2.saque(100.0)
}