package avancado

annotation class Positivo
annotation class NaoVazio

class Pessoa(id: Int, nome: String){
    @Positivo
    var id: Int = id
    @NaoVazio
    var nome: String = nome
}

//Reflection
fun getValor(objeto: Any,nomeDoAtributo: String): Any{
    val atributo = objeto.javaClass.getDeclaredField(nomeDoAtributo)
    val estaAcessivel = atributo.isAccessible
    //
    atributo.isAccessible = true
    val valor = atributo.get(objeto)
    atributo.isAccessible = estaAcessivel

    return valor
}

//fun validar()