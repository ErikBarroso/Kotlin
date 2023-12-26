import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    // Escreva seu código aqui

    val operacao: String = reader.next()
    val a: Int = reader.nextInt()
    val b: Int = reader.nextInt()

    println(
        when{
            operacao == "+" -> a + b
            operacao == "-" -> a - b
            operacao == "*" -> a * b
            operacao == "/" -> "%.1f".format (a.toDouble() / b)
            else -> "Invalid"
        }
    )
}
