import junit.framework.TestCase.assertEquals
import org.junit.Test

class HighestAndLowest {
    fun highAndLow(numbers: String): String {
        var numsToArray = numbers.split(" ").map { it.toInt() }
        return "${numsToArray.maxOrNull()} ${numsToArray.minOrNull()}"
    }

    @Test
    fun test1() {
        assertEquals("42 -9", highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
        assertEquals("3 1", highAndLow("1 2 3"))
    }
}

