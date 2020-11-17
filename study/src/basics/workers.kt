package basics

fun main(args: Array<String>){
    println("Справочник работников!")
    val workersSeats:  MutableMap<Int, String> = mutableMapOf()
    while (true) {
        println("нажмите 1 чтобы добавить сотрудника")
        println("нажмите 2 чтобы посмотреть список сотрудников")
        println("нажмите 3 чтобы найти сотрудника по номеру места")
        println("нажмите 4 чтобы выйти из программы")
        val currentChoice = readLine()!!
        when (currentChoice) {
            "1" -> {
                println("Введите фамилию сотрудника")
                val worker = readLine()!!
                println("Введите номер рабочего места сотрудника")
                val seat = readLine()!!.toInt()
                workersSeats[seat] = worker
            }
            "2" -> for (i in workersSeats) {
                println(i)
            }
            "3" -> {
                println("Введите номер рабочего места сотрудника")
                val seat = readLine()!!.toInt()
                println(workersSeats[seat])
            }

            "4" -> break
        }
    }
}
