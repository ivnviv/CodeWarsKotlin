import junit.framework.TestCase
import junit.framework.TestCase.assertEquals
import org.junit.Test


/*
https://www.codewars.com/kata/56484848ba95170a8000004d/train/kotlin
 */

class speedControl {
    fun gps(s:Int, x:DoubleArray):Int {
        var result = 0

        for (i in 0 until x.size - 1) {
            var gap = x[i + 1] - x[i]
            var speed = ((3600 * gap) / s).toInt()
            if(speed>result) {
                result = speed
            }
        }

        return result
    }

        @Test
        fun test1() {
            println("Fixed Tests: gps")
            var x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
            testing(gps(20, x), 41)
            x = doubleArrayOf(0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25)
            testing(gps(12, x), 219)

        }
        companion object {
            private fun randInt(min:Int, max:Int):Int {
                return min + (Math.random() * ((max - min) + 1)).toInt()
            }
            private fun testing(actual:Int, expected:Int) {
                assertEquals(expected, actual)
            }
        }
    }