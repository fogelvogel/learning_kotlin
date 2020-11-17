package basics

fun printWorker(fio: String, position: String) = println("$fio $position")
fun printWorker(fio: String, position: String, maritalStatus: String) = println("$fio $position $maritalStatus")
fun printWorker(fio: String, age: Int, position: String, maritalStatus: String) = println("$fio $position $maritalStatus")

fun main(args: Array<String>){

    printWorker("Штейн Карл", "управляющий")
    printWorker("Штейн Карл", "управляющий", "женат")
    printWorker("Штейн Карл", 40,"управляющий", "женат")
}
