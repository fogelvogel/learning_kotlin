package OOP

class Aircraft {
    var tailNumber: String = "unknown"

        get() = field

        set(value){
                field = value
        }
    var flightDistance: Int = 5000

        get() = field

        set(value){
            field = value
        }
    var capacity: Int = 3000

        get() = field

        set(value){
            field = value
        }
    var fuelConsumption = 0.0
        get() = (capacity.toDouble() / flightDistance.toDouble()) * 100

        set(value) {
            field = value
        }
}
