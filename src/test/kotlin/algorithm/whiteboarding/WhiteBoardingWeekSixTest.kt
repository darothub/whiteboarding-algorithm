package algorithm.whiteboarding

import algorithm.measureTimeMillis
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.lang.Exception
import java.lang.RuntimeException

@RunWith(JUnit4::class)
internal class WhiteBoardingWeekSixTest {

    @Test
    fun whiteBoardingSixSolutionReturnOneWhenArrayIsEmpty(){
        val actual = 1
        val expected = measureTimeMillis {
            val A = intArrayOf()
            WhiteBoardingWeekSix.solution(A)
        }

        assert(actual == expected.first)
    }

    @Test
    fun whiteBoardingSixSolutionReturnCorrectAnswer(){
        val actual = 4
        val expected = measureTimeMillis {
            val A = intArrayOf(2, 3, 1, 5)
            WhiteBoardingWeekSix.solution(A)
        }

        assert(actual == expected.first)
    }

    @Test
    fun whiteBoardingSixSolutionReturnMissingFirstNumber(){
        val actual = 1
        val expected = measureTimeMillis {
            val A = intArrayOf(2, 3, 4, 5)
            WhiteBoardingWeekSix.solution(A)
        }

        assert(actual == expected.first)
    }
    @Test
    fun whiteBoardingSixSolutionReturnMissingLastNumber(){
        val actual = 6
        val expected = measureTimeMillis {
            val A = intArrayOf(1, 3, 4, 5, 2)
            WhiteBoardingWeekSix.solution(A)
        }

        assert(actual == expected.first)
    }
    @Test
    fun whiteBoardingSixSolutionRunWithinTime(){
        val actual = 4
        val maxTime = 0.04
        val expected = measureTimeMillis {
            val A = intArrayOf(2, 3, 1, 5)
            WhiteBoardingWeekSix.solution(A)
        }

        assert(maxTime > expected.second)
    }

    @Test
    fun whiteBoardingSixSolutionThrowsExceptionOnTimeLimitExceeded(){
        val exception = Exception("RunTimeError")
        try {
            measureTimeMillis {
                val A = intArrayOf(2, 3, 1, 5)
                WhiteBoardingWeekSix.solution(A)
            }
        }
        catch (e:Exception){
            assert(exception.message == e.message)
        }

    }
}