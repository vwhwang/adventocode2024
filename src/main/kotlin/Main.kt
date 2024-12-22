import java.io.File
import kotlin.math.abs

fun main() {
    dayOne()
}

fun dayOne() {
    //Read the input
    val numbers = File("/Users/vickihwang/Developer/practice/adventocode2024/src/main/resources/input.txt")
        .readLines()
    val listOne = emptyList<Int>().toMutableList()
    val listTwo = emptyList<Int>().toMutableList()
    numbers.forEach {
        val list = it.split("\\s+".toRegex())
        listOne+= list[0].toInt()
        listTwo+= list[1].toInt()
    }
    val listOneSorted = listOne.sorted()
    val listTwoSorted = listTwo.sorted()
    var sum = 0
    listOneSorted.forEachIndexed { index, value ->
        sum += abs(value - listTwoSorted[index])
    }
    //answer is 2742123
    println(sum)
}