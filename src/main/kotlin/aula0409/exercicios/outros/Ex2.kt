package aula0409.exercicios.outros

class Pessoa(private val idade: Int, private val sexo: String, private val contribuicao: Int){
    fun podeAposentar(): Boolean{
        return contribuicao >= 30 && ((idade >= 65 && sexo == "M") || (idade >= 60 && sexo == "F"))
    }
}

fun main() {
    println(Pessoa(70,"M", 40).podeAposentar())
    println(Pessoa(40,"M", 20).podeAposentar())
    println(Pessoa(60,"F", 40).podeAposentar())
    println(Pessoa(55,"F", 25).podeAposentar())
}