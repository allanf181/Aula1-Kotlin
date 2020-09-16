package aula1609

fun main() {
    run {
        val estados = listOf("SP", "RJ", "MG")
        println("Quantidade de estados: ${estados.size}")
        println("Terceiro estado: ${estados[2]}")
        println("Index de RJ: ${estados.indexOf("RJ")}")
        println()
    }

    run {
        val estados = mutableListOf("SP", "RJ", "MG")
        estados.add("PR")
        estados[1] = "SC"
        println(estados)
        println()
    }

    run {
        val estados = setOf("SP", "RJ", "MG", "ES")
        println("Quantidade de estados: ${estados.size}")
        println("SP ${if (estados.contains("SP")) "" else "não"}está no conjunto")
        val estados2 = setOf("MG", "ES","SP", "RJ")
        println("Os sets ${if (estados == estados2) "" else "não"}são iguais")
        println()
    }

    run {
        val estados = mutableSetOf<String>()
        estados.add("SP")
        estados.add("MG")
        estados.add("RJ")
        println(estados)
        println()
    }

    run {
        val numeros = mapOf(Pair("one",1), "two" to 2, "three" to 3)
        println("Chaves: ${numeros.keys}")
        println("Valores: ${numeros.values}")
        if("two" in numeros){
            println("Valor da chave two: ${numeros["two"]}")
        }
        println()
    }

    run {
        val numeros = mutableMapOf(Pair("one",1), "two" to 2)
        println(numeros)
        numeros["three"] = 3
        println(numeros)
        numeros["one"] = 13
        println(numeros)
        println()
    }

    run {
        val numeros = mutableMapOf<String, () -> Any>()
        numeros.put("a") { println("teste") }
        numeros["a"]!!.invoke()
    }
}

