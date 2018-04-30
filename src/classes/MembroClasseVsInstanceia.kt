package classes

class ItemPedido(val nome: String,var preco: Double){
    companion object {
        fun create(nome: String, preco: Double) = ItemPedido(nome,preco)
        @JvmStatic var desconto: Double = 0.0
    }
    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}

fun main(args: Array<String>) {
    val item1 = ItemPedido.create("Tv 50",2989.9)
    val item2 = ItemPedido.create("Liquidificar",200.0)
    //
    ItemPedido.desconto = 0.10
    println(item1.precoComDesconto())
    println(item2.precoComDesconto())

}