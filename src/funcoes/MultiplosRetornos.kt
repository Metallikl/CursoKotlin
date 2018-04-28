package funcoes

import java.util.*

data class Horario(val hora: Int, val minuto: Int,val segundo: Int)

fun agora(): Horario{
    val agora = Calendar.getInstance()
    //Usando o with, indicamos q os metodo chamados dentro do {} são relacionados aquele obj
    //então ao inves de usar agora.get(Calendar.HOUR)), usamos apenas get(Calendar.HOUR)), pois o with
    //explicita que o obj será usado como "this"
    with(agora){
        return Horario(get(Calendar.HOUR),get(Calendar.MINUTE),get(Calendar.SECOND))
    }

}

fun main(args: Array<String>) {
    val(h,m,s) = agora()
    val s1 = agora()
    println("$h:$m:$s")
    println("${s1.segundo}")
}
