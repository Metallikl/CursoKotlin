package fundamentos.controle

fun main(args: Array<String>) {
    val alunos = arrayListOf("André","Carla","Marcos","Jose")
    //
    for((indice,aluno)in alunos.withIndex()){
        println("$indice - $aluno")
    }
}