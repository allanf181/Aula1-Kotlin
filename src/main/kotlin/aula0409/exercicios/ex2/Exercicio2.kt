package aula0409.exercicios.ex2

fun main() {
    val jogadorDeFutebol1 = JogadorDeFutebol("Allan")
    val jogadorDeFutebol2 = JogadorDeFutebol("Fernando")
    val sessaoDeTreinamento = SessaoDeTreinamento()
    sessaoDeTreinamento.treinarA(jogadorDeFutebol1)
    sessaoDeTreinamento.treinarA(jogadorDeFutebol2)
}