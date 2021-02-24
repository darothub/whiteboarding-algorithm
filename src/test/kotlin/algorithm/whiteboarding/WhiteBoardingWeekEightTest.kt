package algorithm.whiteboarding

import algorithm.measureTimeMillis
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
internal class WhiteBoardingWeekEightTest {

    @Test
    fun whiteBoardingSevenSolutionReturnCorrectAnswerForFiveItems(){
        val actual = 1
        val expected = measureTimeMillis {
            val a = intArrayOf(-3, -1, -2, -4, -3)
            WhiteBoardingWeekEight.solution(a)
        }

        assert(actual == expected.first)
    }

    @Test
    fun whiteBoardingSevenSolutionReturnCorrectAnswerForTwoItem(){
        val actual = 2
        val expected = measureTimeMillis {
            val a = intArrayOf(1, 3)
            WhiteBoardingWeekEight.solution(a)
        }

        assert(actual == expected.first)
    }

    @Test
    fun whiteBoardingSevenSolutionReturnCorrectAnswerRandomItems(){
        val actual = 4
        val expected = measureTimeMillis {
            val a = intArrayOf(5, 6, 2, 4, 1)
            WhiteBoardingWeekEight.solution(a)
        }

        assert(actual == expected.first)
    }

}