package fundamentos.operadores

fun main(args: Array<String>) {
    val trabalho1: Boolean = true
    val trabalho2: Boolean = false
    //
    val sorvete: Boolean = trabalho1 || trabalho2
    val tv50: Boolean = trabalho1 && trabalho2
    val tv32: Boolean = trabalho1 xor trabalho2
    //
    println(sorvete)
    println(tv50)
    println(tv32)
    //
    if(!sorvete){
        println("A saúde agradece")
    }
}