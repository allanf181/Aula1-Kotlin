package aula0409.exercicios.ex3

fun main() {
    val atleta1 = Atleta("Allan", 1)
    val atleta2 = Atleta("Fernando", 3)
    val prova1 = Prova(1, 50)
    val prova2 = Prova(3, 100)
    val prova3 = Prova(5, 200)

    println(prova1.podeRealizar(atleta1))
    println(prova1.podeRealizar(atleta2))

    println(prova2.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta2))

    println(prova3.podeRealizar(atleta1))
    println(prova3.podeRealizar(atleta2))

}