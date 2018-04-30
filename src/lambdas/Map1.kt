package lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro","Tiago","Jonas")
    //Fun apply, aplica o lambda descrito dentro dele no obj.
    //é possivel referenciar o objeto dentro do apply usando o this
    alunos.map { it.toUpperCase() }.apply { print(this) }
}