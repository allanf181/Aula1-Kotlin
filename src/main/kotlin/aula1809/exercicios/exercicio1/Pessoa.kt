package aula1809.exercicios.exercicio1

class Pessoa(val nome: String, val RG: Int){
    override fun equals(other: Any?): Boolean {
        return this.RG == (other as? Pessoa)?.RG
    }
}