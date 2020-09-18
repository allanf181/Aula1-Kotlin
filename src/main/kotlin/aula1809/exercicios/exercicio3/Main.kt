package aula1809.exercicios.exercicio3

fun main() {
    val alunos = listOf(Aluno("allan1",1), Aluno("allan2",2), Aluno("allan3",3), Aluno("allan4",4))
    println(alunos.contains(Aluno("allan",3)))
}