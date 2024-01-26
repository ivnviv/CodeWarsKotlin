import junit.framework.TestCase.assertEquals
import org.junit.Test

//https://www.codewars.com/kata/55eeddff3f64c954c2000059/train/kotlin


class SumConsecutives {
    fun sumConsecutives(s: List<Int>): List<Int> {
        if (s.isEmpty()) {
            return emptyList()
        }

        var numbers: MutableList<Int> = mutableListOf()
        var i = 0
        var j = 1
        var currentSum = s[i]

        while (j < s.size) {
            if (s[i] == s[j]) {
                currentSum += s[j]
                j++
            } else {
                numbers.add(currentSum)
                i = j
                j++
                currentSum = s[i]
            }
        }
        numbers.add(currentSum) // Add the last sum

        return numbers
    }

    @Test
    fun exampleTests() {
        assertEquals(listOf(1, 12, 0, 4, 6, 1), sumConsecutives(listOf(1, 4, 4, 4, 0, 4, 3, 3, 1)))
        assertEquals(listOf(2, 14, 3), sumConsecutives(listOf(1, 1, 7, 7, 3)))
        assertEquals(listOf(-10, 14, 12, 0), sumConsecutives(listOf(-5, -5, 7, 7, 12, 0)))
        assertEquals(listOf(12, 1), sumConsecutives(listOf(3, 3, 3, 3, 1)))
    }

}



