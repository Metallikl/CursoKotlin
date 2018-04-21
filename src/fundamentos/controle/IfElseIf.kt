package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 8.3

    //Usando operador Range "in"
    //Abaixo, como o valor usando no range é inteiro, o programa faz cast
    //suprimindo o valor depois do . e , por isso, 8.3 entra no range de 7..8
    if(nota in 9..10){
        println("Fantanstico")
    }else if(nota in 7..8){
        println("Parabéns")
    }else if(nota in 4..6){
        println("Tem como recuperar")
    }else if(nota in 0..3){
        println("Te vejo no proximo semestre!")
    }else{
        println("Nota invalida")
    }
    //O operador range sempre dever ser usado do menor para o maior intervalor.
    println(5 in 7..4)//false
    println(5 in 4..7)//true
}