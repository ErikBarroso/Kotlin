package exercicios

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    //alunos de até 4 letras = Grupo A, 5 a 10 letras = grupo b, + de 10 letras = grupo c

    val aluno: String = reader.next()

    val grupo = println(
        when {
        aluno.length < 5 -> "GRUPO A"
        aluno.length < 11 -> "GRUPO B"
        aluno.length > 10 -> "GRUPO C"
        else -> "invalid"
        }
    )
}