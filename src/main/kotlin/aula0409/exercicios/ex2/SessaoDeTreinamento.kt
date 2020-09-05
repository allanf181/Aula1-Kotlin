package aula0409.exercicios.ex2

class SessaoDeTreinamento {
    var experiancia = 0

    fun treinarA(jogadorDeFutebol: JogadorDeFutebol){
        println("Experiencia inicial: ${jogadorDeFutebol.experiencia}")
        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()
        jogadorDeFutebol.experiencia++
        experiancia++
        println("Experiencia final: ${jogadorDeFutebol.experiencia}")
    }
}