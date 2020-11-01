package basics

fun main(args: Array<String>){

    var nullableVariable: Any? = null;
    nullableVariable = 42;
    var newVariable = nullableVariable / 2.5; // double

    var helloVar: String = "hello";
    var aplanaVar: String = "aplana";

//    println("$helloVar $aplanaVar");
//
//    var five: Char = '5';
//    println(five.toString() is String);
//    println(five.toByte() is Byte);
//    println(five.toShort() is Short);
//    println(five.toDouble() is Double);
//    println(five.toFloat() is Float);
//    println(five.toLong() is Long);
//
//    println("Введите свое имя:");
//
//    var nameNullable: String? = readLine();
//    var name = nameNullable;
//
//    println("Здравствуйте, $name");

    var alphabet = "z" .. "a";
    println("Введите число a:");
    var varNullableA: String? = readLine();
    println("Введите число b:");
    var varNullableB: String? = readLine();
    var varA: String = varNullableA!!;
    var varB: String = varNullableB!!;


    println(varA > varB);
}
