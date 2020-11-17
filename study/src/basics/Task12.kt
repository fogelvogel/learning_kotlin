package basics

fun isLeapYear (year: Int) {
    println(if (year % 4 == 0) "високосный год" else "не високосный год")
}
fun main(args: Array<String>){
    while (true) {
        println("Введите год")
        var year = readLine()!!.toInt()
        if (year < 0) break
        isLeapYear(year)
    }
}
