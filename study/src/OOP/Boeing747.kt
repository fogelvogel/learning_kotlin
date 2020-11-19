package OOP

class Boeing747(
        tailNumber: String,
        flightDistance: Int,
        capacity: Int,
        passengers: Int
): Aircraft(tailNumber, flightDistance, capacity), Passenger {
    override val passengerQuantity: Int
    init {
        passengerQuantity = passengers
    }
}
