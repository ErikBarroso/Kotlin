package exercicios
import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    // invertendo números

    while (true) {
        var numero = reader.nextInt()
        if (numero != 0) {
            println(numero*-1)
        }else {
            break
        }
    }
}