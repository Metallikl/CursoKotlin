package fundamentos

fun main(args: Array<String>) {
    /*
    Erro abaixo poiso topo inferido em a é Int e depois foi atribuido double
     */
//    var a = 1
//    var b = 2
//
//    a = 2.3
//
//    print(a+b)
    //Correção
    var a : Double;
    var b = 2

    a = 2.3

    print(a+b)

}