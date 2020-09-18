package aula1809

fun main() {
    val notebook1 = Notebook("Dell", 3000)
    println(notebook1)
    println(Integer.toHexString(notebook1.hashCode()))
    val notebook2 = Notebook("Positivo", 2000)
    println(notebook1 == notebook2)
}