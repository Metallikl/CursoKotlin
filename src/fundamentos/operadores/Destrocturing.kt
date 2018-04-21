package fundamentos.operadores

data class Carro(var marca: String, var modelo: String)

data class Moto(var marca: String, var modelo: String, var cilindradas: Int)

fun main(args: Array<String>) {
    val (marca,modelo) = Carro("Ford","Fusion")
    //
    println("$marca $modelo")
    //
    val(marido,mulher) = listOf("João","Maria")
    println("$marca $mulher")
    //
    val (_,_,terceiroLugar) = listOf("Kimi","Hamilton","Alonso")
    //
    println("$terceiroLugar chegou em 3 lugar")
    //
    val (marcaM,modeloM) = Moto("BMW","M100",300)
    //
    println("$marcaM $modeloM")

}
