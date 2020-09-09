package aula0909.exercicios

fun main() {
    var ingresso = Ingresso()
    println("Digite 1 para ingresso normal e 2 para ingresso VIP")
    when(readLine()!!.toInt()){
        1 -> {
            ingresso = Normal()
        }
        2 -> {
            println("Digite 1 para camarote inferior e 2 para camarote superior")
            when(readLine()!!.toInt()){
                1 -> {
                    ingresso = CamaroteInferior()
                }
                2 -> {
                    ingresso = CamaroteSuperior()
                }
            }
        }
    }
    ingresso.imprimeValor()
}