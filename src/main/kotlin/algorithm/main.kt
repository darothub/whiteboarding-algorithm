@file:JvmName("Main")
package algorithm

import algorithm.whiteboarding.WhiteBoardingWeekEight


fun main(){

    val expected = measureTimeMillis {
        val a = intArrayOf(-3, -1, -2, -4, -3)
        WhiteBoardingWeekEight.solution(a)
    }
    println(expected.first)



}

fun <T> measureTimeMillis(function: () -> T): Pair<T, Double> {
    val startTime = System.currentTimeMillis()/1000.0
    println("startTime: 0:00")
    var result:T = function.invoke()
    var endTime = System.currentTimeMillis()/1000.0 - startTime
    println("endTime: $endTime")
    if (endTime > 0.06){
        throw Exception("RunTimeError")
    }
    else{
        return Pair(result, endTime)
    }

}


