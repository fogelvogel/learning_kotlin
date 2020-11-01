package basics

fun main(args: Array<String>){
    println("Рассчет процента по вкладу");

    println("Введите сумму вклада");
    var sum = readLine()!!.toInt();
    println("Введите процент по вкладу");
    var percent = readLine()!!.toInt();
    println("Введите длительность вклада (в месяцах)");
    var months = readLine()!!.toInt();

    var current = sum;
    var interest = 0;

    for (i in 1 .. months) {
        interest = current * percent/100;
        current += interest;
        println("В конце месяца $i ваш вклад будет составлять $current");
        println("За месяц $i ваш вклад увеличится на $interest");
    }
}
