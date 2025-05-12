////////////////////////////////////////////////////////////////////
// [Maria Fuensanta] [Trigueros Hernandez] [2133487]
// [Alba Hui] [Larrosa Serrano] [2133266]
////////////////////////////////////////////////////////////////////
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

  
    private static final String IV_Expected = String.join("\n",
        "    _____       __       __ ",
        "   |_   _|      \\ \\     / / ",
        "     | |         \\ \\   / /  ",
        "     | |          \\ \\ / /   ",
        "     | |           \\ V /    ",
        "    _| |_           \\  /    ",
        "   |_____|           \\/     "
    );

  
    private static final String V_Expected = String.join("\n",
        " __       __ ",
        " \\ \\     / / ",
        "  \\ \\   / /  ",
        "   \\ \\ / /   ",
        "    \\ V /    ",
        "     \\  /    ",
        "      \\/     "
    );

  
    private static final String VI_Expected = String.join("\n",
        " __       __     _____    ",
        " \\ \\     / /   |_   _|   ",
        "  \\ \\   / /      | |     ",
        "   \\ \\ / /       | |     ",
        "    \\ V /        | |     ",
        "     \\  /       _| |_    ",
        "      \\/       |_____|   "
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

    @Test
    public void testPrint_Four_ShouldReturnIVAscii() {
        // Arrange
        int number = 4;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(IV_Expected, result);
    }

    @Test
    public void testPrint_Five_ShouldReturnVAscii() {
        // Arrange
        int number = 5;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(V_Expected, result);
    }

    @Test
    public void testPrint_Six_ShouldReturnVIAscii() {
        // Arrange
        int number = 6;

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(VI_Expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrint_InvalidNumber_ShouldThrowException() {
        // Arrange
        int number = 0;

        // Act & Assert
        RomanPrinter.print(number);
    }
}
