//https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/kotlin


import junit.framework.TestCase.assertEquals
import org.junit.Test

class HighestScoringWord {

    fun countWordValue(word: String): Int {
        var score = 0

        for (char in word) {
            score += char - 'a' + 1
        }
        return score
    }

    fun high(str: String): String {
        var currentScore = 0
        var maxScore = 0
        var highestScoringWord = ""

        var splittedStr = str.split(" ")

        for (word in splittedStr) {
            currentScore = countWordValue(word)

            if (currentScore > maxScore) {
                maxScore = currentScore
                highestScoringWord = word
            }
        }
        return highestScoringWord
    }

    @Test
    fun testFixed() {
        assertEquals("taxi", high("man i need a taxi up to ubud"))
        assertEquals("volcano", high("what time are we climbing up the volcano"))
        assertEquals("semynak", high("take me to semynak"))
        assertEquals("aa", high("aa b"))
        assertEquals("b", high("b aa"))
        assertEquals("bb", high("bb d"))
        assertEquals("d", high("d bb"))
        assertEquals("aaa", high("aaa b"))
    }
}

