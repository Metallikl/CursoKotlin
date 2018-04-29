package classes

class Produtos(var nome: String,var preco: Double, var desconto: Double, var ativo: Boolean){
    val inativo: Boolean get()= !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main(args: Array<String>) {
    val p1 = Produtos("Ipad",2349.90,0.20,ativo = true)
    println(p1.precoComDesconto)
    //
    val p2 = Produtos("GalaxyNote7",2699.49,0.50,ativo = false)
    println("${p2.nome}")
    println(" De R$ ${p2.preco} ")
    println(" Por R$ ${p2.precoComDesconto} ")
    //
    if(p2.inativo){
        p2.preco = 0.0
        println("Depois de inativo: R$ ${p2.precoComDesconto}")
    }

}