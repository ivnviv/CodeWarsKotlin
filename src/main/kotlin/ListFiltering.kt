import junit.framework.Assert.assertEquals
import org.junit.Test

class ListFiltering {
    fun filterList(l: List<Any>): List<Int> {
        return l.filterIsInstance<Int>()
    }
    @Test
    fun basicTests() {
        assertEquals(listOf(1, 2), filterList(listOf(1, 2, 'a', 'b')))
        assertEquals(listOf(1, 0, 15), filterList(listOf(1, 'a', 'b', 0, 15)))
        assertEquals(listOf(1, 2, 123), filterList(listOf(1, 2, "aasf", '1', "123", 123)))
    }
}