package basics

fun countWorkers(vararg workers: String){

    var count = 0

    for(i in workers) count++

    println("Количество сотрудников: $count")

}

fun main(args: Array<String>){

    countWorkers("Иванов", "Петров")
    countWorkers("Штейн", "Шиммер", "Хэмпф", "Дантон")
    countWorkers("q", "w", "e", "r", "t", "y")
}
