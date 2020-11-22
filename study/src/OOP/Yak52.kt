package OOP

class Yak52(tailNumber: String,
            flightDistance: Int,
            capacity: Int,
            loop: Boolean
): Aircraft(tailNumber, flightDistance, capacity), Sports {
    override val capableOfALoop: Boolean

    init {
        capableOfALoop = loop
    }

    override fun printInfo(){
        super.printInfo()
        println("можно ли сделать мертвую петлю: $capableOfALoop")
    }
}
