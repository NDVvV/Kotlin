package example.myapp

//abstract class AquariumFish{
//    abstract val color: String
//}
//
//class Shark: AquariumFish(), FishAction {
//    override val color = "gray"
//    override fun eat() {
//        println("hunt and eat fish")
//    }
//
//}
//
//class Plecostomus: AquariumFish(), FishAction {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}





class Shark: FishColor, FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }

}



interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

interface FishAction {
    fun eat()
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor
