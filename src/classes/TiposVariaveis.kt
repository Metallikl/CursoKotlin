package classes

val diretamentoNoArquivo = "Bom dia"

fun topLevel(){
    val local = "Fulano"
    println("$diretamentoNoArquivo $local")
}

class Coisa{
    var variavelDeInstancia: String = "Boa noite"
    //Membros static sempre devem ser declarada dentro do companion object
    companion object {
        @JvmStatic val constanteDeClasse = "Ciclano"
    }
    fun fazer(){
        val local: Int = 7

        if(local > 3){
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $constanteDeClasse , $local , $variavelDeBloco")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()
    //
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}