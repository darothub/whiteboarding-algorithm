@file:JvmName("Main")
package algorithm

import algorithm.whiteboarding.BinaryNode
import algorithm.whiteboarding.WhiteBoardingWeekEight
import algorithm.whiteboarding.binaryTreeHeight


fun main(){



    val zero = BinaryNode(0)
    val one = BinaryNode(1)
    val five = BinaryNode(5)
    val seven = BinaryNode(7)
    val eight = BinaryNode(8)
    val nine = BinaryNode(9)


    seven.leftChild = one
    one.leftChild = zero
    one.rightChild = five
    seven.rightChild = nine
    nine.leftChild = eight


    val tree = seven

    val height = binaryTreeHeight(tree)

    println(height)



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


