package aula0409.exercicios.ex4

class Tripe(val alturaMinima: Double, val alturaMaxima: Double) {
    var dobrado = true
    var alturaAtual = alturaMinima

    fun definirAltura(altura: Double) {
        alturaAtual = altura
    }

    fun dobrar(){
        dobrado = true
    }

    fun desdobrar(){
        dobrado = false
    }

    fun guardar(){
        dobrar()
        definirAltura(alturaMinima)
    }

    fun prontoPraGuardar(): Boolean{
        return dobrado && alturaAtual == alturaMinima
    }

    fun usar(){
        desdobrar()
        definirAltura(alturaMaxima)
    }

    fun prontoPraUsar(): Boolean{
        return !dobrado && alturaAtual > alturaMaxima/2
    }
}