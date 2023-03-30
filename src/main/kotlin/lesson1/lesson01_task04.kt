package lesson1

fun main () {
    val seconds: Short = 6480
    val secondsInMunute: Byte = 60

    val minute = (seconds/secondsInMunute).toShort()
    val second = (seconds - minute * secondsInMunute)

    println("\n\n$minute"+":"+second.toString().padStart(2, '0'))
}