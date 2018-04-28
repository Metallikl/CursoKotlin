package funcoes
class Operacoes{
    fun somar(a:Int,b:Int): Int{
        return a+b
    }
}

fun somar(a: Int, b: Int):Int{
    return a+b
}

fun concat(a: Int, b: Int):String{
    return "$a$b"
}

fun calc(a:Int,b:Int,funcao:(Int,Int)-> Int ):Int{
    return funcao(a,b)
}
fun main(args: Array<String>) {
    println(calc(2,3,Operacoes()::somar))
    println(calc(2,3, ::somar))
    //println(calc(2,3, ::concat))//Meu teste, se a func passada não tem a mesma assinatura e retorno,  compilador informa erro.
}