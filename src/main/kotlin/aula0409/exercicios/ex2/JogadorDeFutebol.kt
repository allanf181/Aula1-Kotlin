package aula0409.exercicios.ex2

class JogadorDeFutebol(val nome: String) {
    var energia = 100
    var alegria = 0
    var gols = 0
    var experiencia = 0

    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols++
        println("GOOOOL!")
    }

    fun correr(){
        energia -= 10
        println("Cansei")
    }
}