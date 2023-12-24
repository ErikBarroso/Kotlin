import kotlin.random.Random

//data class Employee(
//    val name: String,
//    var salary: Int,
//)
//fun main() {
//    val emp = Employee("Mary", 20)
//    println(emp)
//    emp.salary += 10
//    println(emp)
//}


data class Employee(val name: String, var salary: Int) //info dos funcionários

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) { // gerar funcionários aleatórios
    val names = listOf("Paulo", "Maria", "Henrique", "Carlos", "jennifer") //nomes que posso usar

    fun generateEmployee() = // gerando funcionários aleatórios
        Employee(names.random(), // nome aleatório da lista
        Random.nextInt(from = minSalary, until = maxSalary)) // salário aleatório pegando o mínimo e o máximo
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30) // definindo o salário mínimo e o máximo
    println(empGen.generateEmployee()) //gerando funcionário
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50 // definindo o salário mínimo
    empGen.maxSalary = 100 // definindo o salário máximo
    println(empGen.generateEmployee()) //gerando funcionário com novo salário mínimo e máximo

}