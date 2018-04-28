package funcoes

fun <E> List<E>.secondOrNull(): E? = if(this.size >=2) this.get(1) else null

fun main(args: Array<String>) {
    val list = listOf("João","Maria","Pedro")
    val list2 = listOf(0,"1",2,3,"4",false)
    //
    println(list.secondOrNull())
    println(list2.secondOrNull())
}