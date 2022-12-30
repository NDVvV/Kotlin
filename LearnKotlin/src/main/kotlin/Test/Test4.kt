package Test

fun main() {
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

//    val lazyFilter = decorations.asSequence().filter { it[0] == 'p' }
//    println("Lazy filter ${lazyFilter.toList()}")


//    val eager = decorations.filter { it [0] == 'p' }
//    println("eager: $eager")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")


}