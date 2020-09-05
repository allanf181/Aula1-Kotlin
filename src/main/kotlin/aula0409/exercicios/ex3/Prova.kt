package aula0409.exercicios.ex3

class Prova(val dificuldade: Int, val energiaNecessaria: Int) {
    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
    }
}