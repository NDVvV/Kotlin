package Test

fun main() {
    val dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println( waterFilter(dirtyLevel) )
}