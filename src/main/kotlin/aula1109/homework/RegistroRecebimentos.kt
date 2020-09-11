package aula1109.homework

class RegistroRecebimentos {
    private val registro = mutableListOf<IRecebivel>()

    fun adicionarRecebimento(r: IRecebivel) = registro.add(r)

    fun apresentarRecebimento() = registro.forEach { r -> println(r) }

}