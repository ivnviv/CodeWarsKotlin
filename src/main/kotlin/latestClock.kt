//https://www.codewars.com/kata/58925dcb71f43f30cd00005f/train/kotlin


import junit.framework.TestCase.assertEquals
import org.junit.Test

class LatestClock {
    fun latestClock(a: Int, b: Int, c: Int, d: Int): String {
        val used = BooleanArray(4)
        val time = CharArray(5)
        var latestTime = "00:00"

        fun generateTime(index: Int) {
            if (index == 5) {
                val hours = time.slice(0..1).joinToString("").toInt()
                val minutes = time.slice(3..4).joinToString("").toInt()
                val currentTime = "%02d:%02d".format(hours, minutes)

                if (hours < 24 && minutes < 60 && currentTime > latestTime) {
                    latestTime = currentTime
                }
                return
            }

            for (i in 0 until 4) {
                if (!used[i]) {
                    used[i] = true
                    time[index] = when (index) {
                        2 -> ':'
                        else -> ('0' + when (i) {
                            0 -> a
                            1 -> b
                            2 -> c
                            else -> d
                        })
                    }
                    generateTime(index + 1)
                    used[i] = false
                }
            }
        }

        generateTime(0)
        return latestTime
    }

    @Test
    fun sampleTests() {
        assertEquals("21:59", latestClock(9, 1, 2, 5) )

    }

}