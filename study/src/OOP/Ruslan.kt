package OOP

class Ruslan(
        tailNumber: String,
        flightDistance: Int,
        capacity: Int,
        liftingInTons: Double
): Aircraft(tailNumber, flightDistance, capacity), LiftingCapacity {
    override val liftingCapacityInTons: Double
    init {
        liftingCapacityInTons = liftingInTons
    }

    override fun printInfo(){
        super.printInfo()
        println("грузоподъемность в тоннах: $liftingCapacityInTons")
    }
}
