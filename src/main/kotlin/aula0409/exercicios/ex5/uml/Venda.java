package aula0409.exercicios.ex5.uml;

public class Venda {
    public Cliente cliente;
    public Veiculo veiculoVendido;
    public double valorDaVenda;


    public Venda(Cliente cliente, Veiculo veiculoVendido, double valorDaVenda) {
        this.cliente = cliente;
        this.veiculoVendido = veiculoVendido;
        this.valorDaVenda = valorDaVenda;
    }
}
