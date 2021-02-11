@file:JvmName("Main")
package algorithm
import algorithm.whiteboarding.WhiteBoardingWeekFive
import algorithm.whiteboarding.WhiteBoardingWeekFour
import algorithm.whiteboarding.WhiteBoardingWeekSix
import java.util.*


fun main(){

    val expected = measureTimeMillis {
        val A = intArrayOf(20, 21, 22)
        WhiteBoardingWeekSix.solution(A)
    }
    println(expected.first)


}

fun <T> measureTimeMillis(function: () -> T): Pair<T, Double> {
    val startTime = System.currentTimeMillis()/1000.0
    println("startTime: 0:00")
    var result:T = function.invoke()
    var endTime = System.currentTimeMillis()/1000.0 - startTime
    println("endTime: $endTime")
    if (endTime > 0.01){
        throw Exception("RunTimeError")
    }
    else{
        return Pair(result, endTime)
    }

}


