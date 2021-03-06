package aula0909

class Pessoa(idade: Int = 0, especie: String = "", val nome: String = "") : Animal(idade, especie) {

    override fun locomover() {
        for(passos in 0..10){
            println("A pessoa $nome está no passo $passos")
        }
    }

    override fun come(comida: String): String {
        return "O $nome esta comendo $comida"
    }

    fun idadePessoa(){
        super.idade()
        println("Nome $nome é uma pessoa")
    }

}