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

//    var alphabet = "z" .. "a";
//    println("Введите число a:");
//    var varNullableA: String? = readLine();
//    println("Введите число b:");
//    var varNullableB: String? = readLine();
//    var varA: String = varNullableA!!;
//    var varB: String = varNullableB!!;
//
//
//    println(varA > varB);

    println("Тест: насколько вы любите птиц?");
    var birdsCount = 0;
    println("Вопрос 1: Держали ли вы ранее птиц? 1 - да, 2 - нет");
    birdsCount += if (readLine()!!.toInt() == 1) 3 else 0;

    if (birdsCount > 0) {
        println("Вопрос 1.1: Сколько птиц у вас было? (введите количество)");

        when (readLine()!!.toInt()) {
            1 -> birdsCount++;
            in 2 .. 5 -> birdsCount +=2;
            in 5 .. 20 -> birdsCount +=3;
        }
    }

    println("Вопрос 2: Есть ли у вас сейчас птицы? 1 - да, 2 - нет");
    if (readLine()!!.toInt() == 1) {
        birdsCount +=3;

        println("Вопрос 2.1: Сколько птиц у вас есть? (введите количество)");

        when (readLine()!!.toInt()) {
            1 -> birdsCount++;
            in 2 .. 5 -> birdsCount +=2;
            in 5 .. 20 -> birdsCount +=3;
        }

        println("Вопрос 2.2: Выпускаете ли вы птиц полетать (походить) ежедневно? 1 - да, 2 - нет");
        birdsCount += if (readLine()!!.toInt() == 1) 2 else 0;
    }

    println("Вопрос 3: Любите ли мемы с птицами? 1 - Обожаю, 2 - да, 3 - нет");
    var answer = readLine()!!.toInt()
    if (answer == 1) {
        birdsCount += 2
    }
    else if (answer == 2) birdsCount++;

    println("Вопрос 4: Нравится ли вам наблюдать за птицами? 1 - Обожаю, 2 - да, 3 - нет");
    var answerBirdWatch = readLine()!!.toInt()
    if (answerBirdWatch == 1) {
        birdsCount += 4
    }
    else if (answerBirdWatch == 2) birdsCount += 2;

    println("Ваши результаты:");
    when(birdsCount) {
        in 0..3 -> println("Похоже, вы не очень любите птиц");
        in 4..9 -> println("Вы любите птиц");
        in 10..20 -> println("Птицы - ваша жизнь");
    }
}
