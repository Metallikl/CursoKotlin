package lambdas

data class Casa(var endereco: String = "",var num: Int = 0)

fun main(args: Array<String>) {
    var casa = Casa()
    //A diferença entre Apply e Run é que o run não retorna o obj corrente e , portanto,
    //não é possivel encadear chamadas
    casa.run {
        endereco = "Rua ABC"
        num = 1544
    }
    //
    println(casa)
}