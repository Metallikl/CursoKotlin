package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null // safe call operator, nome do operador ?
    println(a?.dec())//Retorna null e não crash. BOA
}