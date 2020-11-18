package OOP

class Boeing747(
        tailNumber: String,
        flightDistance: Int,
        capacity: Int,
        val passengersQuantity: Int
): Aircraft(tailNumber, flightDistance, capacity) {
}
