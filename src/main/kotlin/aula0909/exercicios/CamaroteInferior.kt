package aula0909.exercicios

class CamaroteInferior(val fileira: String = "A", val assento: String = "1") : VIP() {
    fun imprimeLocalizacao(){
        println("Fileira: $fileira, assento: $assento")
    }
}