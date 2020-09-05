package aula0409.exercicios.ex5

fun main() {
    val concessionaria = Concessionaria()
    val veiculo = Veiculo("marca","modelo", 2020, "preto", 0)
    val cliente = Cliente("Allan", "Fernando", "+55 11 11111111")
    concessionaria.registrarVenda(veiculo,cliente, 100000.0 )
}