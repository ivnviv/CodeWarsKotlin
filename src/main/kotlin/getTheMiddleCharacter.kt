import junit.framework.TestCase.assertEquals
import org.junit.Test

class getTheMiddleCharacter {
    fun getMiddle(word: String): String {
        var result = StringBuilder()
        var numbers = word.toCharArray()
        var i = numbers.size / 2-1
        var i2 = i + 1


        if (numbers.size % 2 == 0) {
            result.append(numbers[i]).append(numbers[i2])
            return result.toString()
        } else {
            return result.append(numbers[i+1]).toString()
        }
    }

    @Test
    fun basicTest() {
        assertEquals("es", getMiddle("test"));
        assertEquals("dd", getMiddle("middle"));
        assertEquals("t", getMiddle("testing"));
        assertEquals("A", getMiddle("A"));
    }
}