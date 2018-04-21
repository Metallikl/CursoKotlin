package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>) {
    kotlin.io.println()//Por padrão o import kotlin.io.* esta disponivel em todos os arquivo .kt
    //
    kotlin.io.println(funcaoSimples("OK"))
    //
    val coisa = Coisa("Bola")
    println(coisa.nome)
    //
    println(CARA)
    //
    println("${soma(2,3)} ${subtracao(2,3)}")
}