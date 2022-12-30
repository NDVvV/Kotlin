package Test

import java.util.Random

fun swim(name : String, speed : String = "fast") {
    println("swimming $speed and $name")
}

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    println("$day has temperature $temperature and dirty $dirty")
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) ->  true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun randomDay2() : String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun main(args : Array<String>) {
    println(shouldChangeWater(randomDay2(), Random().nextInt(100), Random().nextInt(100)))
}