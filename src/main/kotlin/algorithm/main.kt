@file:JvmName("Main")
package algorithm

import algorithm.whiteboarding.*


fun main(){

    println(WhiteBoardingWeekThree.revrot("123456987654", 6)) //--> "234561876549"
    println(WhiteBoardingWeekThree.revrot("123456987653", 6)) //--> "234561356789"
    println(WhiteBoardingWeekThree.revrot("66443875", 4)) //--> "44668753"
    println(WhiteBoardingWeekThree.revrot("66443875", 8))  // --> "64438756"
    println(WhiteBoardingWeekThree.revrot("664438769", 8 )) // --> "67834466"
    println(WhiteBoardingWeekThree.revrot("123456779", 8)) // --> "23456771"
    println(WhiteBoardingWeekThree.revrot("", 8)) //--> ""
    println(WhiteBoardingWeekThree.revrot("123456779", 0)) //--> ""
    println(WhiteBoardingWeekThree.revrot("563000655734469485", 4)) // --> "0365065073456944"

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


