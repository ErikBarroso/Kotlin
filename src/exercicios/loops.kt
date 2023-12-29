package exercicios
import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    // invertendo números

//    while (true) {
//        var numero = reader.nextInt()
//        if (numero != 0) {
//            println(numero*-1)
//        }else {
//            break
//        }
//    }

    // Somando números

    val quantidadeNumeros = reader.nextInt()
    var soma = 0

    for(i in 0 until quantidadeNumeros) {
        soma += reader.nextInt()
    }
    print(soma)
}