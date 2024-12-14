import io.cursedfunction.buildStanza
import kotlin.test.Test
import kotlin.test.assertEquals

class TwelveDaysStanzaTest {

    @Test
    fun `Given day 1 expect the first stanza`() {
        val expected = """
            On the first day of Christmas,
            My true love sent to me:
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 1)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 2 expect the second stanza`() {
        val expected = """
            On the second day of Christmas,
            My true love sent to me:
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 2)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 3 expect the third stanza`() {
        val expected = """
            On the third day of Christmas,
            My true love sent to me:
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 3)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 4 expect the fourth stanza`() {
        val expected = """
            On the fourth day of Christmas,
            My true love sent to me:
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 4)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 5 expect the fifth stanza`() {
        val expected = """
            On the fifth day of Christmas,
            My true love sent to me:
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 5)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 6 expect the sixth stanza`() {
        val expected = """
            On the sixth day of Christmas,
            My true love sent to me:
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 6)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 7 expect the seventh stanza`() {
        val expected = """
            On the seventh day of Christmas,
            My true love sent to me:
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 7)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 8 expect the eighth stanza`() {
        val expected = """
            On the eighth day of Christmas,
            My true love sent to me:
            Eight maids a-milking
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 8)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 9 expect the ninth stanza`() {
        val expected = """
            On the ninth day of Christmas,
            My true love sent to me:
            Nine ladies dancing
            Eight maids a-milking
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 9)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 10 expect the tenth stanza`() {
        val expected = """
            On the tenth day of Christmas,
            My true love sent to me:
            Ten lords a-leaping
            Nine ladies dancing
            Eight maids a-milking
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 10)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 11 expect the eleventh stanza`() {
        val expected = """
            On the eleventh day of Christmas,
            My true love sent to me:
            Eleven pipers piping
            Ten lords a-leaping
            Nine ladies dancing
            Eight maids a-milking
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 11)

        assertEquals(expected, actual)
    }

    @Test
    fun `Given day 12 expect the twelfth stanza`() {
        val expected = """
            On the twelfth day of Christmas,
            My true love sent to me:
            Twelve drummers drumming
            Eleven pipers piping
            Ten lords a-leaping
            Nine ladies dancing
            Eight maids a-milking
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.
        """.trimIndent()

        val actual = buildStanza(day = 12)

        assertEquals(expected, actual)
    }
}
