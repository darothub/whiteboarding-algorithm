package algorithm.whiteboarding

import algorithm.measureTimeMillis
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.lang.Exception
import java.lang.RuntimeException

@RunWith(JUnit4::class)
internal class WhiteBoardingWeekFiveTest {

    @Test
    fun whiteBoardingFiveSolutionReturnCorrectAnswer(){
        val actual = intArrayOf(9, 7, 6, 3, 8)
        val expected = measureTimeMillis {
            val A = intArrayOf(3, 8, 9, 7, 6)
            val K = 3
            WhiteBoardingWeekFive.solution(A, K)
        }

        assert(actual.contentEquals(expected.first))
    }
    @Test
    fun whiteBoardingFiveSolutionRunWithinTime(){
        val actual = intArrayOf(9, 7, 6, 3, 8)
        val maxTime = 0.06
        val expected = measureTimeMillis {
            val A = intArrayOf(3, 8, 9, 7, 6)
            val K = 3
            WhiteBoardingWeekFive.solution(A, K)
        }

        assert(maxTime > expected.second)
    }

    @Test
    fun whiteBoardingFiveSolutionThrowsExceptionOnTimeLimitExceeded(){
        val exception = Exception("RunTimeError")
        try {
            measureTimeMillis {
                val A = intArrayOf(3, 8, 9, 7, 6)
                val K = 3
                WhiteBoardingWeekFive.solution(A, K)
            }
        }
        catch (e:Exception){
            assert(exception.message == e.message)
        }



    }
}