package aula0409.objetos

fun main() {
    val brasileiro = Pessoa()
    //println("O brasileiro é ${brasileiro.nome} e tem a idade de ${brasileiro.idade}")

    brasileiro.nome = "Allan Fernando"
    //println("O brasileiro é ${brasileiro.nome} e tem a idade de ${brasileiro.idade}")

    brasileiro.andar()

    //-------------------------------------------------------------------------------

    val cachorro = Cachorro("Bidu", 2, "Golden")
    //println("O nome do cachorro é ${cachorro.nome}")
    //println("A raça é ${cachorro.raca} e idade ${cachorro.idade}")

    brasileiro.passerComDog(cachorro)
}