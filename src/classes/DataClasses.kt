package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp",320)
    val g2 = Geladeira("Brastemp",320)
    //
    println(g1 == g2)

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)
    //
    //Data Class represetam classes de dados(models do no db?) e possue metodos como toString,Copy e Equal ja implmentados
    println(tv1 == tv2)
    println(tv1 === tv2)
    println(g1.toString())
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(polegadas = 42))
    //
    //Destructurin só funcionam com Data Class
    val(marca,polegada) = tv1
    println("$marca $polegada")
//    val(marca_g,litros) = g1 // Esse linha gera erro e compilação pois a geladeira nnão é data class e sim class.
//    println("$marca_g $litros")
}
