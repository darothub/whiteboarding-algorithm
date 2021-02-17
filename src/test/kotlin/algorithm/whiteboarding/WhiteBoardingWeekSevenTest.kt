package algorithm.whiteboarding

import algorithm.measureTimeMillis
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.lang.Exception

@RunWith(JUnit4::class)
internal class WhiteBoardingWeekSevenTest {

    @Test
    fun whiteBoardingSevenSolutionReturnCorrectAnswerForFiveItems(){
        val actual = 7
        val expected = measureTimeMillis {
            val a = intArrayOf(9, 3, 9, 3, 7)
            WhiteBoardingWeekSeven.solution(a)
        }

        assert(actual == expected.first)
    }

    @Test
    fun whiteBoardingSevenSolutionReturnCorrectAnswerForSingleItem(){
        val actual = 42
        val expected = measureTimeMillis {
            val a = intArrayOf(42)
            WhiteBoardingWeekSeven.solution(a)
        }

        assert(actual == expected.first)
    }

    @Test
    fun whiteBoardingSevenSolutionReturnCorrectAnswerForSevenItems(){
        val actual = 7
        val expected = measureTimeMillis {
            val a = intArrayOf(9, 3, 9, 3, 9, 7, 9)
            WhiteBoardingWeekSeven.solution(a)
        }

        assert(actual == expected.first)
    }

}