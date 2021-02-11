package algorithm.whiteboarding

import algorithm.measureTimeMillis
import java.util.*

class WhiteBoardingWeekSix {

    companion object {
//        An array A consisting of N different integers is given.
//        The array contains integers in the range [1..(N + 1)],
//        which means that exactly one element is missing.
//
//        Your goal is to find that missing element.
//
//        Write a function:
//
//        class Solution { public int solution(int[] A); }
//
//        that, given an array A, returns the value of the missing element.
//
//        For example, given array A such that:
//
//        A[0] = 2
//        A[1] = 3
//        A[2] = 1
//        A[3] = 5
//        the function should return 4, as it is the missing element.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [0..100,000];
//        the elements of A are all distinct;
//        each element of array A is an integer within the range [1..(N + 1)].
        fun solution(A: IntArray): Int {

            var sumOfAllNumbers = 0
            for (num in A) sumOfAllNumbers += num
            val N = A.size.toLong()
            val expectedSumOfAllNumbers = (N + 1) * (N + 2) / 2

            val missingNumber = expectedSumOfAllNumbers - sumOfAllNumbers

            return missingNumber.toInt()

        }

    }
}


