fun main() {

    for(number in 1..100) {

        println(
            when{
                number % 5 == 0  && number % 3 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else  -> number
            }
        )
    }

}
