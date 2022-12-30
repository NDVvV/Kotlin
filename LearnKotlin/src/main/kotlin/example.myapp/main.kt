//package example.myapp
//
//import example.myapp.decor.makeDecorations
//import example.myapp.decor.makeDecorations2
//
//fun buildAquarium() {
////    val myAquarium1 = Aquarium()
////    //default value
////    myAquarium1.printSize()
//
////    val aquarium2 = Aquarium(width = 25)
////    aquarium2.printSize()
//
////    // default width
////    val aquarium3 = Aquarium(height = 35, length = 110)
////    aquarium3.printSize()
//
////    // everything custom
////    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
////    aquarium4.printSize()
//
////    val myAquarium5 = Aquarium(numberOfFish = 29)
////    //default value
////    myAquarium5.printSize()
////
////    myAquarium5.volume = 70
////    myAquarium5.printSize()
//
//    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
//    aquarium6.printSize()
//
//    val myTower = TowerTank(diameter = 25, height = 40)
//    myTower.printSize()
//
//}
//
//fun makeFish() {
//    val shark = Shark()
//    val pleco = Plecostomus()
//
//    println("Shark: ${shark.color}")
//    shark.eat()
//    println("Plecostomus: ${pleco.color}")
//    pleco.eat()
//}
//
//fun main() {
////    buildAquarium()
////    makeFish()
//    makeDecorations2()
//}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

fun main() {
//    println(Direction.EAST.name)
//    println(Direction.EAST.ordinal)
//    println(Direction.EAST.degrees)

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())
}