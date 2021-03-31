@file:JvmName("Main")
package algorithm

import algorithm.whiteboarding.*


fun main(){

    println(twoSum(intArrayOf(3,2,4), 6).toList())
    println(twoSum(intArrayOf(2,7,11,15), 6).toList())
    println(twoSum(intArrayOf(3,3), 6).toList())

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


