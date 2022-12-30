package Test

fun main(args: Array<String>) {
//    println("Hello World! ${args[0]}" )
//    val isUnit = println("This is an expression")
//    println(isUnit)

    val temperature = 60
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)

}