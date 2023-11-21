import junit.framework.TestCase
import org.junit.Test

/*
Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.
 */

class alternateCapitalization {
    fun capitalize(text: String): List<String> {
        var res1 = StringBuilder()
        var res2 = StringBuilder()

        for ((index, char) in text.withIndex()) {
            if (index % 2 == 0) {
                res1.append(char.uppercaseChar())
                res2.append(char.lowercaseChar())
            } else {
                res1.append(char.lowercaseChar())
                res2.append(char.uppercaseChar())
            }
        }
        return listOf(res1.toString(), res2.toString())
    }

    @Test
    fun `AltCapsTests`() {
        TestCase.assertEquals(listOf("AbCdEf", "aBcDeF"), capitalize("abcdef"))
        TestCase.assertEquals(listOf("CoDeWaRs", "cOdEwArS"), capitalize("codewars"))
        TestCase.assertEquals(listOf("AbRaCaDaBrA", "aBrAcAdAbRa"), capitalize("abracadabra"))
        TestCase.assertEquals(listOf("CoDeWaRrIoRs", "cOdEwArRiOrS"), capitalize("codewarriors"))

    }
}