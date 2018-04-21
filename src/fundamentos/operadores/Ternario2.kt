package fundamentos.operadores

fun obterResultado(nota: Double): String = if(nota>=7) "Aprovado" else "Reprovado"
//fun obterResultado(nota: Double): String{
//   return if(nota>=7) "Aprovado" else "Reprovado"
//}

fun main(args: Array<String>) {
    println(obterResultado(6.3))
}