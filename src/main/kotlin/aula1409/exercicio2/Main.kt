package aula1409.exercicio2

fun main() {
    val fatura1 = Fatura(1,"", 2, 3.0)
    val fatura2 = Fatura(2,"", 2, -3.0)
    val fatura3 = Fatura(3,"", -2, 3.0)

    println(fatura1.getTotalFatura())
    println(fatura2.getTotalFatura())
    println(fatura3.getTotalFatura())
}