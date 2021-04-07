@file:JvmName("Main")
package algorithm

import algorithm.whiteboarding.*


fun main(){

    println(WhiteBoardingWeekTwo.reverse(123)) // 321
    println(WhiteBoardingWeekTwo.reverse(-123)) // -321
    println(WhiteBoardingWeekTwo.reverse(120)) // 12
    println(WhiteBoardingWeekTwo.reverse(1534236469)) // 0

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


