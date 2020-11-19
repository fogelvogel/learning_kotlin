package OOP

abstract class Aircraft (
        protected val tailNumber: String,
        protected val flightDistance: Int,
        protected val capacity: Int) {

    var fuelConsumption = 0.0
        get() = (capacity.toDouble() / flightDistance.toDouble()) * 100

        set(value) {
            field = value
        }

    open fun printInfo() {
        println("бортовой номер: $tailNumber")
        println("макс. дальность полета: $flightDistance")
        println("вместимость бака: $capacity")
    }
}
