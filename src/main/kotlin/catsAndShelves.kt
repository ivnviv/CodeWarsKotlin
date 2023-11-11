/*
An infinite number of shelves are arranged one above the other in a staggered fashion.
The cat can jump either one or three shelves at a time: from shelf i to shelf i+1 or i+3
(the cat cannot climb on the shelf directly above its head), according to the illustration:
 */
import junit.framework.TestCase.assertEquals
import org.junit.Test
class catsAndShelves {

    fun solution(start: Int, finish: Int): Int {
        val jumps = (finish-start)/3+(finish-start)%3
        return jumps
    }

    @Test
    fun `catTests`() {
        assertEquals(2, solution(1, 5))
        assertEquals(2, solution(2, 4))
        assertEquals(45, solution(26, 159))

    }
}