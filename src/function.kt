//import kotlin.math.PI
//
//fun circleArea(radius: Int): Double = PI * radius * radius
//fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) = ((hours * 60) + minutes) * 60 + seconds
//
//
//fun main() {
//    println(circleArea(2))
//    println(intervalInSeconds(1, 20, 15))
//    println(intervalInSeconds(minutes = 1, seconds = 25))
//    println(intervalInSeconds(hours = 2))
//    println(intervalInSeconds(minutes = 10))
//    println(intervalInSeconds(hours = 1, seconds = 1))
//}


//val actions = listOf("title", "year", "author")
//val prefix = "https://example.com/book-info"
//val id = 5
//
//fun url(actions: String, id: Int): ()-> String =  { -> "$prefix/$id/$actions" }
//
//fun main() {
//
//    val buildUrl = url(actions[0], id)
//
//    println(buildUrl())
//
//}

fun repeatN(n: Int, action: () -> Unit) {
    for(n in 1..n) {
        action()
    }
}

fun main() {
    repeatN(5) {
        println("Hello")
    }
}