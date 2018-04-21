package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null
    //
    println(a?.inc())
    //Abaixa erro
    println("Agora o erro")
    println(a!!.inc())//Operador !! que indica que a função deve ser chamada mesmo sabendo que a var pode ser null
                      //Vc explicitamente assume o risco e nullpointException

}