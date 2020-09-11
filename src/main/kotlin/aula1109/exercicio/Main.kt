package aula1109.exercicio

fun main() {
    val impressora = Impressora()
    impressora.adicionar(Foto("img1.jpg"), Documento("doc1.docx"), Contrato("contrato1.pdf"))
    impressora.imprimir()
}