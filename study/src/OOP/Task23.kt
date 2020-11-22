package OOP

data class Car(val color: String, val model: String, val licensePlate: String)

fun main(args: Array<String>){
    val car = Car("black", "T", "q123qq")
    println(car)
}
