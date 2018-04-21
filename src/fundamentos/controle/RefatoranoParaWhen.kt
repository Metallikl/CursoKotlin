package fundamentos.controle

fun main(args: Array<String>) {
    val nota = -56
    //Switch case do Kotlin
    when(nota){
        10,9 -> println("Fantanstico")
        8,7 -> println("Parabens")
        6,5,4 -> println("Tem como recupers")
        in 0..3 -> println("te vejo semestre que vem")
        else ->  println("Nota invalida")//Default do When
    }
}