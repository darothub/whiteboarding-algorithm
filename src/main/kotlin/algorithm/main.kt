@file:JvmName("Main")
package algorithm

import algorithm.whiteboarding.BinaryNode
import algorithm.whiteboarding.WhiteBoardingWeekEight
import algorithm.whiteboarding.binaryTreeHeight
import algorithm.whiteboarding.lengthOfLongestSubstring


fun main(){


   lengthOfLongestSubstring("codingisawesome") // Answer 7


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


