package fundamentos

fun main(args: Array<String>) {
    //Inteiros
    val num1: Byte = 127//armazena de -128 ate 127
    val num2: Short = 32767//armazena de -32768 ate 32767
    val num3: Int = 2_147_483_647//armazena de -2147483648 ate 2147483647
    val num4: Long =  9223372036854775807//armazena de -9223372036854775808 ate 9223372036854775807 // Long.MAX_VALUE
    val num4_1: Long =  Long.MAX_VALUE//armazena de -9223372036854775808 ate 9223372036854775807 // Long.MAX_VALUE
    //Reais
    val num5 : Float = 3.14F//Todos os numero reais são double, por isso aqui colocamos o F no final para indicar que é flot e por iso usará só 4 bytes
    val num6 : Double = 3.14//
    //Caractere
    val char: Char = '?'
    val boolean: Boolean = true //Não aceita 0 e 1
    //
    println(listOf(num1,num2, num3, num4, num4_1,num5,num6, char,boolean))
    //
    println(2 is Int)
    println(2_147_483_648 is Long)
    println(1.0 is Double)
    // TUDO EM KOTLIN É OBJETO
    println(10.dec())//o.O

}