package funcoes

fun ordernar(vararg numeros: Int,a: Int):IntArray{
    println(a)
    return numeros.sortedArray()
}

fun main(args: Array<String>) {

    for(n in ordernar(1000,55,6,7,11,9,0,10,20,30,1,100,a=99)){
        print("$n ")
    }
}