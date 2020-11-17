package basics

fun main(args: Array<String>) {
    var testArray = Array<String>(10){"1"}
    testArray[2] = "test"
    testArray[5] = "string"

    var printArray = { arrayToPrint: Array<String> ->

        for (i in arrayToPrint) {
            println("$i ")
        }
    }
    printArray(testArray)
}
