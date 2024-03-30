import junit.framework.TestCase.assertEquals
import org.junit.Test
import kotlin.math.min

//https://www.codewars.com/kata/58485a43d750d23bad0000e6/train/kotlin

/*
минута равномерно делится на три - "Fizz"

минута равномерно делится на пять - "Buzz"

Когда минута делится поровну на оба, часы будут показывать "Fizz Buzz", за двумя исключениями:
    В назначенный час вместо "Fizz Buzz" дверца часов откроется, и оттуда выйдет птичка с кукушкой и "Cuckoo"  от одного до двенадцати раз в зависимости от часа.
    По истечении получаса, вместо "Fizz Buzz", дверца часов откроется, и кукушка выйдет и "Cuckoo" всего один раз.

    С минутами, которые неравномерно делятся ни на три, ни на пять - "tick"
 */

class FizzBuzzCuckooClock {
    val MINUTE_DIVIDED_THREE_EQUALY = "Fizz"
    val MINUTE_DIVIDED_FIVE_EQUALY = "Buzz"
    val MINUTE_DIVIDED_THREE_AND_FIVE_EQUALY = "Fizz Buzz"
    val MINUTE_NOT_DIVIDED_THREE_AND_FIVE_EQUALY = "tick"
    val ROUND_HOUR = "Cuckoo"

    fun fizzBuzzCuckooClock(time: String): String {
        var phrase = ""
        val s = time.split(":")
        val minutes = s[1].toInt()
        val hours = s[0].toInt()


        if (minutes == 30) {
            phrase = "Cuckoo"
        } else if (minutes == 0) {
            val cuckooCount = if (hours > 12) hours - 12 else if (hours == 12) 12 else if(hours == 0) 12 else hours
            for (i in 1..cuckooCount) {
                phrase += "Cuckoo "
            }
        } else if (minutes % 3 == 0 && minutes % 5 == 0) {
            phrase = "Fizz Buzz"
        } else if (minutes % 3 == 0) {
            phrase = "Fizz"
        } else if (minutes % 5 == 0) {
            phrase = "Buzz"
        } else phrase = "tick"


        return phrase
    }

    @Test
    fun someBasicTimesTests() {
        println("Testing with time 13:34")
        assertEquals("tick", fizzBuzzCuckooClock("13:34"))
        println("Testing with time 21:00")
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo ", fizzBuzzCuckooClock("21:00"))
        println("Testing with time 11:15")
        assertEquals("Fizz Buzz", fizzBuzzCuckooClock("11:15"))
        println("Testing with time 03:03")
        assertEquals("Fizz", fizzBuzzCuckooClock("03:03"))
        println("Testing with time 14:30")
        assertEquals("Cuckoo", fizzBuzzCuckooClock("14:30"))
        println("Testing with time 08:55")
        assertEquals("Buzz", fizzBuzzCuckooClock("08:55"))
        println("Testing with time 00:00")
        assertEquals(
            "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo",
            fizzBuzzCuckooClock("00:00")
        )
        println("Testing with time 12:00")
        assertEquals(
            "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo",
            fizzBuzzCuckooClock("12:00")
        )
    }

}

//fun main() {
//    val a = FizzBuzzCuckooClock()
//    println(a.fizzBuzzCuckooClock("00:00"))
//}