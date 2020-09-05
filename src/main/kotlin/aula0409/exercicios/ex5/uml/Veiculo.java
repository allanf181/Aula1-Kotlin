package aula0409.exercicios.ex5.uml;


public class Veiculo {
    public String marca;
    public String modelo;
    public int anoFabricacao;
    public String cor;
    public int quilometragem;

    public Veiculo(String marca, String modelo, int anoFabricacao, String cor, int quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.quilometragem = quilometragem;
    }
}
