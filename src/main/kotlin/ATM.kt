import junit.framework.TestCase.assertEquals
import org.junit.Test

/*
An ATM has banknotes of nominal values 10, 20, 50, 100, 200 and 500 dollars. You can consider that there is a large enough supply of each of these banknotes.

You have to write the ATM's function that determines the minimal number of banknotes needed to honor a withdrawal of n dollars, with 1 <= n <= 1500.

Return that number, or -1 if it is impossible.
 */

class ATM {


    fun count(number: Int): Int {
        val banknotes = intArrayOf(500, 200, 100, 50, 20, 10)
        var count: Int = 0
        var amount = number

        for (banknote in banknotes) {
            count += amount / banknote
            amount %= banknote
        }

        return if (amount == 0) count else -1
    }

    @Test
    fun `ATM Payment Possible`() {
        assertEquals(4, count(770))
        assertEquals(1, count(10))
    }

    @Test
    fun `ATM Payment Impossible`() {
        assertEquals(-1, count(125))
        assertEquals(-1, count(238))
    }

}



