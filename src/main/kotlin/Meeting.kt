//https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/kotlin


import junit.framework.TestCase.assertEquals
import org.junit.Test

//class Meeting {
//
//    fun meeting(s: String): String {
//        fun meeting(s: String): String {
//            val names = s.split(";").map { it.split(":") }
//            val sortedNames = names.sortedWith(compareBy({ it[1].toUpperCase() }, { it[0].toUpperCase() }))
//
//            return sortedNames.joinToString("") { "(${it[1]}, ${it[0]})" }.toUpperCase()}
//        }
//
//        @Test
//        fun testFixed() {
//            assertEquals(
//                "(ARNO, ANN)(BELL, JOHN)(CORNWELL, ALEX)(DORNY, ABBA)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(SCHWARZ, VICTORIA)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)",
//                meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn")
//            )
//            assertEquals(
//                "(BELL, MEGAN)(CORNWELL, AMBER)(DORNY, JAMES)(DORRIES, PAUL)(GATES, JOHN)(KERN, ANN)(KORN, ANNA)(META, ALEX)(RUSSEL, ELIZABETH)(STEVE, LEWIS)(WAHL, MICHAEL)",
//                meeting("John:Gates;Michael:Wahl;Megan:Bell;Paul:Dorries;James:Dorny;Lewis:Steve;Alex:Meta;Elizabeth:Russel;Anna:Korn;Ann:Kern;Amber:Cornwell")
//            )
//            assertEquals(
//                "(ARNO, ALEX)(ARNO, HALEY)(BELL, SARAH)(CORNWELL, ALISSA)(DORNY, PAUL)(DORRIES, ANDREW)(KERN, ANN)(KERN, MADISON)",
//                meeting("Alex:Arno;Alissa:Cornwell;Sarah:Bell;Andrew:Dorries;Ann:Kern;Haley:Arno;Paul:Dorny;Madison:Kern")
//            )
//        }
//
//    }

