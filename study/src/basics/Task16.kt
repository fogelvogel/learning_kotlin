package basics

import kotlin.math.sqrt

fun main(args: Array<String>) {
    fun Double.sqrt(): Double {

        return sqrt(this)

    }
    var test: Double = 121.0;
    var test2: Double = 2.0;
    var test3: Double = 123.15;

    println(test.sqrt());
    println(test2.sqrt());
    println(test3.sqrt());
}
