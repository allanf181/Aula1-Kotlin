package aula1809.exercicios.exercicio4

class Funcionario(val nome: String, val numeroDeRegistro: Int){
    override fun equals(other: Any?): Boolean {
        return this.numeroDeRegistro == (other as? Funcionario)?.numeroDeRegistro
    }
}
