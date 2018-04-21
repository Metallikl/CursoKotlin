package fundamentos

fun imprimirConceito(nota: Any){
    when(nota as Int){//as é o operador "Cast". as? cast opcional, se cast não possivel, retorna null
    //when(nota as? Int){as? "Cast" opcional, se cast não possivel, retorna null
    //when(nota as? Int ?: 5){as? "Cast" opcional, se cast não possivel, retorna null. Com operado Elvis, retorna 5 se null
        10,9 -> println("A")
        8,7 -> println("B")
        6,5 -> println("C")
        4,3 -> println("D")
        2,1,0 -> println("E")
        else -> println("Nota invalida")
    }
}

fun main(args: Array<String>) {
    val notas = arrayOf(9.6,3.8,7.2,5.5,4.1)
    //
    for(nota in notas){
        imprimirConceito(nota.toInt())
    }
}
