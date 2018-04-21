package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrão"//Caso o valor seja null, atribui valor padrão.
                                                        //Seria o mesmo que opcional opcional != null ? opcional : "Valor Padrão"
                                                        //Por isso "?:".

    println(obrigatorio)

}