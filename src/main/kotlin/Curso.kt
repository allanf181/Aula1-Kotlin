fun main() {
    println("Hello World")
    println(mostrarMeuNome("Fernando",19))
}

fun mostrarMeuNome(sobrenome: String, idade: Int): String {

    val idadeRecebida = when (idade) {
        18 -> "tem 18 anos"
        20 -> "tem 20 anos"
        30 -> "tem 30 anos"
        else -> "não se sabe a idade"
    }

    return "Allan $sobrenome e idade $idadeRecebida"
}

fun alunosDeAndroid(): ArrayList<String> {

    val listaAlunos = arrayListOf<String>()
    listaAlunos.add("Allan")

    return listaAlunos
}

