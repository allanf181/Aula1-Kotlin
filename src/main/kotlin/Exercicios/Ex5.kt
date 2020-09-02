package Exercicios

fun ex5(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return (numA > numC && numA > numD) || (numB > numC && numB > numD)
}

fun main() {
    print(ex5(4,3,2,1))
}