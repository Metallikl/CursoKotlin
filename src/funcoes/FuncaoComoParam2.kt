package funcoes

fun <E> filtrar(lista: List<E>,filtro: (E) -> Boolean): List<E>{
    val listFiltrada = ArrayList<E>()
    //
    for(e in lista){
        if(filtro(e)){
            listFiltrada.add(e)
        }
    }
    return listFiltrada
}

fun com3Letras(nome: String): Boolean{
    return nome.length == 3
}
//Meu teste, func filtrar é generics, é possivel aplicar para outros fins
fun maiorQue5(nota: Int): Boolean{
    return nota > 5
}

fun main(args: Array<String>) {
   val nomes = listOf("Ana","Pedro","Bia","Gui","Rebeca")
   val notas = listOf(10,2,3,5,6,3,7)//Meu teste
    //
    println(filtrar(nomes,::com3Letras))
    println(filtrar(notas,::maiorQue5))//Meu teste
}