package aula1409.exercicio3

class Estoque(private var nome: String){
    private var qtdMinima = 0
    private var qtdAtual = 0

    fun mudarNome(nome: String){
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int){
        if(qtdMinima > 0){
            this.qtdMinima = qtdMinima
        }
    }

    fun repor(qtd: Int){
        if(qtd > 0){
            qtdAtual += qtd
        }
    }

    fun darBaixa(qtd: Int){
        if(qtd in 1..qtdAtual){
            qtdAtual -= qtd
        }
    }

    fun mostrar(): String {
        return "Nome: $nome\nQuantidade mínima: $qtdMinima\nQuantidade atual: $qtdAtual\n"
    }

    fun precisaRepor(): Boolean{
        return qtdAtual <= qtdMinima
    }
}