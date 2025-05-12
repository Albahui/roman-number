package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanPrinterTest {

    private static final String I_Expected = String.join("\n",
        "    _____    ",
        "   |_   _|   ",
        "     | |     ",
        "     | |     ",
        "     | |     ",
        "    _| |_    ",
        "   |_____|   "
    );

    private static final String II_Expected = String.join("\n",
        "    _____        _____    ",
        "   |_   _|      |_   _|   ",
        "     | |          | |     ",
        "     | |          | |     ",
        "     | |          | |     ",
        "    _| |_        _| |_    ",
        "   |_____|      |_____|   "
    );

    private static final String III_Expected = String.join("\n", 
        "    _____        _____        _____    ",
        "   |_   _|      |_   _|      |_   _|   ",
        "     | |          | |          | |     ",
        "     | |          | |          | |     ",
        "     | |          | |          | |     ",
        "    _| |_        _| |_        _| |_    ",
        "   |_____|      |_____|      |_____|   "
    );

    @Test
    public void testPrint_One_ShouldReturnIAscii() {
        // Arrange
        int number = 1;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(I_Expected, result);
    }

    @Test
    public void testPrint_Two_ShouldReturnIIAscii() {
        // Arrange
        int number = 2;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(II_Expected, result);
    }


    @Test
    public void testPrint_Three_ShouldReturnIIIAscii() {
        // Arrange
        int number = 3;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(III_Expected, result);
    }

 
    @Test(expected = IllegalArgumentException.class)
    public void testPrint_InvalidNumber_ShouldThrowException() {
        // Arrange
        int number = 0;

        // Act & Assert
        RomanPrinter.print(number);
    }
}
