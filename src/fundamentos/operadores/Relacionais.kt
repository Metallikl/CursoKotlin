package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana")//Igualdade Estrita
    //
    println( 3 !== 2)
    //
    println( 3 < 2)
    println( 3 > 2)
    println( 3 <= 2)
    println( 3 >= 2)
    //
    val d1 = Date(0)
    val d2 = Date(0)
    //igualdade referencial(Referencia de memoria)
    println("Resultado com '===' ${d1 === d2}")
    //igualdade estrutural(No kotlin, com == ele chama internamente o metodo iguals dos objs)
    println("Resultado com '==' ${d1 == d2}")
    //println("Resultado com '==' ${d1.equals(d2)}")
    //Meu teste
    val d3 = Date(0)
    val d4 = d3
    println("Resultado com '===' ${d3 === d4}")
    //
}