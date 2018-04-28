package funcoes

fun relacaoDeTrabalhao(chefe: String, funcionario: String):String{
    return "$funcionario é subordinado ao $chefe."
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalhao("Jão","Maria"))
    println(relacaoDeTrabalhao(funcionario ="Jão",chefe = "Maria"))
}