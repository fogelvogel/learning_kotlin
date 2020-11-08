package basics

fun main(args: Array<String>){
    val countries: Array<Array<String>> = Array(5, { Array(3, {""}) })

    countries[0] = arrayOf("Албания", "Тирана", "Лек")
    countries[1] = arrayOf("Азербайджан", "Баку", "Манат")
    countries[2] = arrayOf("Сан-Томе и Принсипи", "Сан-Томе", "Добра")
    countries[3] = arrayOf("Сьерра-Леоне", "Фритаун", "Леоне")
    countries[4] = arrayOf("Тайланд", "Бангкок", "Бат")

    println("Страна Столица Валюта")

    for(i in countries){

        for(j in i){

            print("$j ")

        }

        println()

    }
}
