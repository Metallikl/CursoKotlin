package lambdas

fun main(args: Array<String>) {
    val listComNull: List<String?> = listOf("A",null,"B",null,"C",null)
    //
    for(item in listComNull){
        item?.let {println(it)}
    }
}