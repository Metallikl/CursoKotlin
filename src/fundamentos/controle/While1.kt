package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int = 0
    //
    while (opcao != -1){
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?:0
        //
        println("Vc escolheu a opção $opcao")
    }
    //
    println("Até a proxima")
}