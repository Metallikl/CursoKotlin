package classes

enum class DiaSemana2(val id: Int, val nome: String, val util: Boolean){
    DOMINGO(1,"Domingo",false),
    SEGUNDA(1,"SEGUNDA",true),
    TERÇA(1,"TERÇA",true),
    QUARTA(1,"QUARTA",true),
    QUINTA(1,"QUINTA",true),
    SEXTA(1,"SEXTA",true),
    SABADO(1,"SABADO",false)
}

fun main(args: Array<String>) {
    for(dia in DiaSemana2.values()){
        println("${dia.nome} é um dia ${if(dia.util) "util" else " do final de semana"}")
    }
}