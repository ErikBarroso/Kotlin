package exercicios

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    //alunos de até 4 letras = Grupo A, 5 a 10 letras = grupo b, + de 10 letras = grupo c

//    val aluno: String = reader.next()
//
//    val grupo = println(
//        when {
//        aluno.length < 5 -> "GRUPO A"
//        aluno.length < 11 -> "GRUPO B"
//        aluno.length > 10 -> "GRUPO C"
//        else -> "invalid"
//        }
//    )

    // multiplos de 7

//    val numero = reader.nextInt()
//
//    println(
//        when{
//            numero % 7 == 0 -> "É MÚLTIPLO DE 7"
//            numero % 7 != 0 -> "ESSE NÃO É"
//            else -> "invalid"
//        }
//    )

    //Saída diferente a depender do valor de P e R

    val p = reader.nextInt()
    val r = reader.nextInt()

    println(
        when {
            p == 0 -> "C"
            p == 1 && r == 1 -> "A"
            p == 1 && r == 0 -> "B"
            else -> "invalid"
        }
    )


}