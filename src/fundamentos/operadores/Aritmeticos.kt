package fundamentos.operadores

fun main(args: Array<String>) {
    val (v1,v2,v3,v4,v5) = listOf(3,5,1,15,6)
    //
    val soma = v1 + v2 + v3 + v4
    val sub = v4 - v2
    val div = v4 / v1
    val mult = v1 * v2
    val mod = v1 % 2
    //
    println("$soma $sub $div $mult $mod")

}