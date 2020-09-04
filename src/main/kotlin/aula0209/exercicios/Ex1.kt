package aula0209.exercicios

import kotlin.math.max

fun maiorNumero(n1: Int, n2: Int, n3: Int): Int {
    return max(n1,max(n2,n3))
}

fun main() {
    print(maiorNumero(3,2,1))
}