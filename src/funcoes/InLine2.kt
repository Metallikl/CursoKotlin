package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("Entrando no metodo $nomeFuncao... ")
    //
    try{
        return funcao()
    }finally {
        println("Metodo $nomeFuncao finalizando...")
    }
}

fun somar2(a: Int,b: Int): Int{
    return a + b
}

fun main(args: Array<String>) {
    val resultado = executarComLog("somar"){
        somar2(4,5)
    }
    //OU
    /*                             param 1
    val resultado = executarComLog("somar",
    \/ funca anonima(lambda) cujo o resultado será passado como parametro, para o param 2(funcao) da fun executarComLog o.O
    {
        somar2(4,5)
    })*/
    //
    println(resultado)
}