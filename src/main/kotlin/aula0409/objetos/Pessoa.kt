package aula0409.objetos

class Pessoa(var nome: String = "Allan", var idade: Int = 19) {
    init {
        println("Nome é: $nome")
    }

    var sexo = "M"

    init {
        println("Sexo é: $sexo")
    }

    fun andar() {
        println("A pessoa $nome esta andando")
    }

    private fun criarRG(nome: String, numero: Int): String{
        return nome+numero
    }

    fun passerComDog(cachorro: Cachorro){
        println("Estou passeando com meu cachorro ${cachorro.nome}")
    }
}