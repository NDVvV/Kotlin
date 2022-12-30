package Test

import java.util.*

fun randomDay() : String{
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun feedTheFish(day : String) : String {
//    val day = Test.randomDay()
//    val food = "rice"
//    println("Today is ${day} and the fish eat ${food}")
    var food = ""
    when(day) {
        "Monday" -> food = "rice1"
        "Tuesday" -> food = "rice2"
        "Wednesday" -> food = "rice3"
        "Thursday" -> food = "rice4"
        "Friday" -> food = "rice5"
        "Saturday" -> food = "rice6"
        "Sunday" -> food = "rice7"
        else -> food = "nothing"
    }
    return food
}

fun main(args: Array<String>) {
    val day = randomDay()
    val food = feedTheFish(day)
    println("Today is ${day} and the fish eat ${food}")
}