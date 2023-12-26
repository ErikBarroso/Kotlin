import java.util.Scanner
fun main() {

    // operaçao entre 2 números
//    val reader = Scanner(System.`in`)
//    // Escreva seu código aqui
//
//    val operacao: String = reader.next()
//    val a: Int = reader.nextInt()
//    val b: Int = reader.nextInt()
//
//    println(
//        when{
//            operacao == "+" -> a + b
//            operacao == "-" -> a - b
//            operacao == "*" -> a * b
//            operacao == "/" -> "%.1f".format (a.toDouble() / b)
//            else -> "Invalid"
//        }
//    )

    // potência de dois
    val reader = Scanner(System.`in`)

    var result: Int = 1
    val n: Int = reader.nextInt()

    for(number in 1..n){
        result *= 2
    }
    print(result)
}


