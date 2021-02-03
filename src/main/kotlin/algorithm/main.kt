@file:JvmName("Main")
package algorithm
import algorithm.whiteboarding.WhiteBoardingWeekFive
import algorithm.whiteboarding.WhiteBoardingWeekFour


fun main(){

    val expected = measureTimeMillis {
        val A = intArrayOf(3, 8, 9, 7, 6)
        val K = 3
        WhiteBoardingWeekFive.solution(A, K)
    }
    println(expected.first.asList())


}

fun <T> measureTimeMillis(function: () -> T): Pair<T, Double> {
    val startTime = System.currentTimeMillis()/1000.0
    println("startTime: 0:00")
    var result:T = function.invoke()
    var endTime = System.currentTimeMillis()/1000.0 - startTime
    println("endTime: $endTime")
    if (endTime > 0.04){
        throw Exception("RunTimeError")
    }
    else{
        return Pair(result, endTime)
    }

}


