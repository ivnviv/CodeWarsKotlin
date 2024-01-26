import junit.framework.TestCase.assertEquals
import org.junit.Test

class NumberOfPairs {
    fun numberOfPairs(gloves:List<String>) : Int {
        val colorCount = mutableMapOf<String, Int>()
        for (color in gloves) {
            colorCount[color] = colorCount.getOrDefault(color, 0) + 1
        }
        var result = 0
        for (count in colorCount.values){
            result += count / 2
        }

        return result
    }
    @Test
    fun sampleTests() {
        assertEquals(1, numberOfPairs( arrayOf("red","red").toList()) )
        assertEquals(0, numberOfPairs( arrayOf("red","green","blue").toList()) )
        assertEquals(3, numberOfPairs( arrayOf("gray","black","purple","purple","gray","black").toList()) )
        assertEquals(0, numberOfPairs( emptyList<String>()) )
        assertEquals(4, numberOfPairs( arrayOf("red","green","blue","blue","red","green","red","red","red").toList()) )
    }
}