package basics

fun main(args: Array<String>){
    println("Список городов!")
    val withRepetitions: MutableList<String> = mutableListOf()
    val withoutRepetitions: MutableSet<String> = mutableSetOf()
    while (true) {
        println("нажмите 1 чтобы добавить город")
        println("нажмите 2 чтобы посмотреть список городов")
        println("нажмите 3 чтобы посмотреть список городов без повторений")
        println("нажмите 4 чтобы выйти из программы")
        val currentChoice = readLine()!!
        when (currentChoice) {
            "1" -> {
                println("Введите название города")
                val city = readLine()!!
                withRepetitions.add(city)
                withoutRepetitions.add(city)
            }
            "2" -> for (i in withRepetitions) {
                println(i)
            }
            "3" -> for (i in withoutRepetitions) {
                println(i)
            }
            "4" -> break
        }
    }
}
