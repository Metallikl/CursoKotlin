package classes

class Data(var dia: Int,var mes: Int, var ano: Int){

    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    var nascimento: Data = Data(dia= 22,mes = 1,ano=1988)
    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    //
    nascimento.mes = 11
    println(nascimento.formatar())
}