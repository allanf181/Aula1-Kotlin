package aula1109.exercicio

fun main() {
    val impressora = Impressora()
    impressora.adicionar(Foto("img1.jpg"))
    impressora.adicionar(Documento("doc1.docx"))
    impressora.adicionar(Contrato("contrato1.pdf"))
    impressora.imprimir()
}