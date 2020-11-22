package OOP

fun main() {
    println("Авиапарк")
    val planes = mutableListOf<Aircraft>()

    val yak1 = Yak52("BK-201", 300, 500, true)
    val yak2 = Yak52("132456", 250, 500, false)

    val boeing1 = Boeing747("Бройлер 747", 1500, 10000, 666)
    val boeing2 = Boeing747("BNG-1337", 2000, 12000, 660)

    val ruslan1 = Ruslan("RUS-22", 2000, 15000, 30.5)
    val ruslan2 = Ruslan("R-132", 1900, 15000, 35.0)

    planes.add(yak1)
    planes.add(yak2)
    planes.add(boeing1)
    planes.add(boeing2)
    planes.add(ruslan1)
    planes.add(ruslan2)

    while (true) {
        var quantityOfPlanes = planes.size

        println("Выберите номер самолета (от 1 до $quantityOfPlanes) чтобы просмотреть детальную информацию о нем")
        println("Введите 0 чтобы просмотреть список самолетов")
        println("Введите -1 чтобы выйти из программы")
        val currentChoice = readLine()!!
        if (currentChoice == "0") {
            for (i in planes) {
                i.printShortInfo()
            }
        } else if (currentChoice.toInt() > 0) {
            planes[currentChoice.toInt() - 1].printInfo()
            println()
        } else break
    }
}
