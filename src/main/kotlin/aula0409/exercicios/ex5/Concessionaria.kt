package aula0409.exercicios.ex5

class Concessionaria {

    private val vendas = ArrayList<Venda>()

    fun registrarVenda(veiculo: Veiculo,cliente: Cliente,valor: Double){
        vendas.add(Venda(cliente,veiculo,valor))
    }
}