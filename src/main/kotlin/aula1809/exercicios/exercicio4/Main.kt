package aula1809.exercicios.exercicio4

fun main() {
    val funcionarios = listOf(Funcionario("allan1",1), Funcionario("allan2",2), Funcionario("allan3",3), Funcionario("allan4",4))
    println(funcionarios.contains(Funcionario("allan",3)))
}