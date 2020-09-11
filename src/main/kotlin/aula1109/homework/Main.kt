package aula1109.homework

fun main() {
    val registroRecebimentos = RegistroRecebimentos()
    registroRecebimentos.adicionarRecebimento(ItemVenda("A", 50, 2.5))
    registroRecebimentos.adicionarRecebimento(Servico("B", 30, 1.5))
    registroRecebimentos.apresentarRecebimento()
}