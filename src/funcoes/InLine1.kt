package funcoes

inline fun transacao(funcao: () -> Unit){
    println("Abrindo transação..")
    try{
        funcao()
    }finally {
        println("Fechando transação")
    }
}
//Meu teste
inline fun transacao2(a: Int,funcao: () -> Unit){
    println("Abrindo transação..")
    try{
        funcao()
    }finally {
        println("Fechando transação")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executano SQL 1...")
        println("Executano SQL 2...")
        println("Executano SQL 3...")
    }
    // ou
    transacao() {
        println("Executano SQL 1...")
        println("Executano SQL 2...")
        println("Executano SQL 3...")
    }
    // ou
    transacao ({
        println("Executano SQL 1...")
        println("Executano SQL 2...")
        println("Executano SQL 3...")
    })
    //FUNÇÃO COM PARAMETRO E DEPOIS FUNCAO QUE SERÁ PASSADA POR PARAMETRO
    //Meu teste
//    transacao2(2){
//        println("Executano SQL 1...")
//        println("Executano SQL 2...")
//        println("Executano SQL 3...")
//    }
//    //ou
//    transacao2 (2,{
//        println("Executano SQL 1...")
//        println("Executano SQL 2...")
//        println("Executano SQL 3...")
//    })
}