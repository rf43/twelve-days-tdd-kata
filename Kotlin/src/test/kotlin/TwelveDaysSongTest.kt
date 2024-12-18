import io.cursedfunction.buildCarol
import kotlin.test.Test
import kotlin.test.assertEquals

class TwelveDaysSongTest {

    @Test
    fun `Given a call to build entire song expect entire song in the correct order and format`() {
        val expected = """
            On the first day of Christmas,
            My true love sent to me:
            A partridge in a pear tree.

            On the second day of Christmas,
            My true love sent to me:
            Two turtle doves and
            A partridge in a pear tree.

            On the third day of Christmas,
            My true love sent to me:
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.

            On the fourth day of Christmas,
            My true love sent to me:
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.

            On the fifth day of Christmas,
            My true love sent to me:
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.

            On the sixth day of Christmas,
            My true love sent to me:
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.

            On the seventh day of Christmas,
            My true love sent to me:
            Seven swans a-swimming
            Six geese a-laying
            Five golden rings
            Four calling birds
            Three french hens
            Two turtle doves and
            A partridge in a pear tree.

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

        val actual = buildCarol()

        assertEquals(expected, actual)
    }
}
