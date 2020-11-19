package OOP

abstract class Aircraft (val tailNumber: String, val flightDistance: Int, val capacity: Int) {

    var fuelConsumption = 0.0
        get() = (capacity.toDouble() / flightDistance.toDouble()) * 100

        set(value) {
            field = value
        }
}
