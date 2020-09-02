package Exercicios

fun comparaString(s1: String, s2: String): Boolean{
    return s1 != s2
}

fun main() {
    println(comparaString("a","b"))
    println(comparaString("a","a"))
}