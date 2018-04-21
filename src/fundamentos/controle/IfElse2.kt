package fundamentos.controle

fun main(args: Array<String>) {
    val num1: Int = 2
    val num2: Int = 3
    //Abaixo constante recebendo uma função.
    //No exemplo abaixo, a ultima linha do bloco de codigo, deve ser
    //o retorno do valor a ser atribuido a constante
    //kotlin não possiu ternario, então é sempre usado if else em subistituição
    //Ex: val maiorValor = if(num1 > num2) num1 else num2 //porem não pode haver mum bloco de codigo só o retorno
    val maiorValor = if(num1 > num2){
        println("Processando If...")
        num1
    }else{
        println("Processando Else..")
        num2
    }
    //
    println("O maior valor é $maiorValor.")
}