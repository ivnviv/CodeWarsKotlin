import junit.framework.TestCase
import org.junit.Test

class growthOfAPopulation {
    fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
        var currentPopulation = pp0
        var yearsCounter = 0

        while (currentPopulation < p) {
            currentPopulation = (currentPopulation + currentPopulation * percent / 100 + aug).toInt()
            yearsCounter++
        }
        return yearsCounter
    }
    @Test
    fun test1() {
        println("Fixed Tests: nbYear")
        TestCase.assertEquals(15, nbYear(1500, 5.0, 100, 5000));

    }
}