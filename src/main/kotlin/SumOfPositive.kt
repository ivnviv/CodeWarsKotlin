import junit.framework.TestCase.assertEquals
import org.junit.Test

class SumOfPositive {
    fun sum(numbers: IntArray): Int {
        var sum = 0
        for (number in numbers) {
            if (number >= 0){
                sum += number
            }
        }
        return sum
    }

    @Test
    fun testSomething() {
        assertEquals(15, sum(intArrayOf(1, 2, 3, 4, 5)))
        assertEquals(13, sum(intArrayOf(1, -2, 3, 4, 5)))
        assertEquals(0, sum(intArrayOf()))
        assertEquals(0, sum(intArrayOf(-1, -2, -3, -4, -5)))
        assertEquals(9, sum(intArrayOf(-1, 2, 3, 4, -5)))
    }
}

//fun main() {
//    val test = SumOfPositive()
//    println(test.sum(intArrayOf(-1, 2, -3, 4, 5)))
//}