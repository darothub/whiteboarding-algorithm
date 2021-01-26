@file:JvmName("Main")
package algorithm
import algorithm.whiteboarding.WhiteBoardingWeekFour


fun main(){

    val expected = measureTimeMillis {
        val X = 10
        val Y = 85
        val D = 30
        WhiteBoardingWeekFour.frogJump(X, Y, D)
    }
    println(expected)


}

fun <T> measureTimeMillis(function: () -> T): T {
    val startTime = System.currentTimeMillis()/1000.0
    println("startTime: 0:00")
    var result:T = function.invoke()
    var endTime = System.currentTimeMillis()/1000.0 - startTime
    println("endTime: $endTime")
    if (endTime > 0.006){
        throw Exception("RunTimeError")
    }
    else{
        return result
    }

}


