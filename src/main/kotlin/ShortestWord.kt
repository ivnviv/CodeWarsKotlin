import junit.framework.TestCase.assertEquals
import org.junit.Test

class ShortestWord {
    fun findShort(s: String): Int {
        val newStr = s.split(" ")
        var curentLenght = newStr[0].length

        for (word in newStr) {
            if (word.length < curentLenght){
                curentLenght = word.length

            }
        }
        return curentLenght
    }

    @Test
    fun testFixed() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"))
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"))
        assertEquals(2, findShort("Let's travel abroad shall we"))
    }
}