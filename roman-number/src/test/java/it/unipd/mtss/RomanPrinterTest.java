////////////////////////////////////////////////////////////////////
// [Maria Fuensanta] [Trigueros Hernandez] [2133487]
// [Alba Hui] [Larrosa Serrano] [2133266]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanPrinterTest {

    // ASCII Art para números clave
    private static final String I_Expected = String.join("\n",
        "    _____    ",
        "   |_   _|   ",
        "     | |     ",
        "     | |     ",
        "     | |     ",
        "    _| |_    ",
        "   |_____|   "
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

    private static final String X_Expected = String.join("\n",
        " __    __    ",
        " \\ \\  / /    ",
        "  \\ \\/ /     ",
        "   \\  /      ",
        "   /  \\      ",
        "  / /\\ \\     ",
        " /_/  \\_\\    "
    );

     private static final String[] L_Expected = String.join("\n",
        " __          ",
        "|  |         ",
        "|  |         ",
        "|  |         ",
        "|  |         ",
        "|  |_____    ",
        "|________|   "
    );

    // Tests para los números representativos
    @Test
    public void testPrint_One_ShouldReturnIAscii() {
        assertEquals(I_Expected, RomanPrinter.print(1));
    }

    @Test
    public void testPrint_Three_ShouldReturnIIIAscii() {
        String expected = I_Expected + I_Expected + I_Expected;
        assertEquals(expected, RomanPrinter.print(3));
    }

    @Test
    public void testPrint_Four_ShouldReturnIVAscii() {
        String expected = I_Expected + V_Expected;
        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    public void testPrint_Five_ShouldReturnVAscii() {
        assertEquals(V_Expected, RomanPrinter.print(5));
    }

    @Test
    public void testPrint_Six_ShouldReturnVIAscii() {
        String expected = V_Expected + I_Expected;
        assertEquals(expected, RomanPrinter.print(6));
    }

    @Test
    public void testPrint_Nine_ShouldReturnIXAscii() {
        String expected = I_Expected + X_Expected;
        assertEquals(expected, RomanPrinter.print(9));
    }

    @Test
    public void testPrint_Ten_ShouldReturnXAscii() {
        assertEquals(X_Expected, RomanPrinter.print(10));
    }

    @Test
    public void testPrint_Fourteen_ShouldReturnXIVAscii() {
        String expected = X_Expected + I_Expected + V_Expected;
        assertEquals(expected, RomanPrinter.print(14));
    }

    @Test
    public void testPrint_Fifteen_ShouldReturnXVAscii() {
        String expected = X_Expected + V_Expected;
        assertEquals(expected, RomanPrinter.print(15));
    }

    @Test
    public void testPrint_Sixteen_ShouldReturnXVIAscii() {
        String expected = X_Expected + V_Expected + I_Expected;
        assertEquals(expected, RomanPrinter.print(16));
    }

    @Test
    public void testPrint_Nineteen_ShouldReturnXIXAscii() {
        String expected = X_Expected + I_Expected + X_Expected;
        assertEquals(expected, RomanPrinter.print(19));
    }

    @Test
    public void testPrint_Twenty_ShouldReturnXXAscii() {
        String expected = X_Expected + X_Expected;
        assertEquals(expected, RomanPrinter.print(20));
    }

    @Test
    public void testPrint_Thirty_ShouldReturnXXXAscii() {
        String expected = X_Expected + X_Expected + X_Expected;
        assertEquals(expected, RomanPrinter.print(30));
    }

    @Test
    public void testPrint_Fourty_ShouldReturnXLAscii() {
        String expected = X_Expected + L_Expected;
        assertEquals(expected, RomanPrinter.print(40));
    }

    @Test
    public void testPrint_Fifty_ShouldReturnLAscii() {
        String expected = L_Expected;
        assertEquals(expected, RomanPrinter.print(50));
    }

    // Casos inválidos
    @Test(expected = IllegalArgumentException.class)
    public void testPrint_Zero_ShouldThrowException() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrint_Negative_ShouldThrowException() {
        RomanPrinter.print(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrint_AboveTwenty_ShouldThrowException() {
        RomanPrinter.print(21);
    }
}
