package Exercicios

fun maiorNumero(n1: Int, n2: Int, n3: Int): Int {
    return intArrayOf(n1,n2,n3).maxOrNull()!!
}

fun main() {
    print(maiorNumero(3,2,1))
}