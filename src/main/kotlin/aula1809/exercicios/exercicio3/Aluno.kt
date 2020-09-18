package aula1809.exercicios.exercicio3

class Aluno(val nome: String, val numeroDoAluno: Int){
    override fun equals(other: Any?): Boolean {
        return this.numeroDoAluno == (other as? Aluno)?.numeroDoAluno
    }
}