import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    // invertendo valores de array

    /* val quantidadeDeMatriculas: Int = reader.nextInt()
     val matriculas = IntArray(quantidadeDeMatriculas)

     for(matricula in 0 until quantidadeDeMatriculas) {
         matriculas[matricula] = reader.nextInt()
     }

     for(matricula in quantidadeDeMatriculas -1 downTo 0) {
         print("${matriculas[matricula]} ")
     }
     */

    val quantidadeDeMatriculas: Int = reader.nextInt()
    val matriculas = IntArray(quantidadeDeMatriculas)

    for(matricula in 0 until quantidadeDeMatriculas) {
        matriculas[matricula] = reader.nextInt()
    }

    var matriculasInvertidas = matriculas.reversedArray()
    print(matriculasInvertidas.joinToString(" "))


}

