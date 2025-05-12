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
    private static final String[] C_Expected = String.join("\n",
        "  ________   ",
        " /  ______|  ",
        "|  |         ",
        "|  |         ",
        "|  |         ",
        "|  |______   ",
        " \\________|  "
    
    );

    private static final String[] D_Expected = String.join("\n",
        " _______     ",
        "|  ____  \\   ",
        "|  |  |  |   ",
        "|  |  |  |   ",
        "|  |  |  |   ",
        "|  |__|  |   ",
        "|_______/    "
    );

    private static final String[] M_Expected = String.join("\n",
        " __    __    ",
        "|  \\  /  |   ",
        "|   \\/   |   ",
        "| |\\  /| |   ",
        "| | \\/ | |   ",
        "| |    | |   ",
        "|_|    |_|   "
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
    @Test
    public void testPrint_FiftyFive_ShouldReturnLAscii() {
        String expected = L_Expected + V_Expected;
        assertEquals(expected, RomanPrinter.print(55));
    }
    @Test
    public void testPrint_Ninety_ShouldReturnLAscii() {
        String expected = X_Expected + C_Expected;
        assertEquals(expected, RomanPrinter.print(90));
    }
    @Test
    public void testPrint_NinetyNine_ShouldReturnLAscii() {
        String expected = I_Expected + C_Expected;
        assertEquals(expected, RomanPrinter.print(100));
    }
    @Test
    public void testPrint_TwoHundred_ShouldReturnLAscii() {
        String expected = C_Expected + C_Expected;
        assertEquals(expected, RomanPrinter.print(200));
    }
    @Test
    public void testPrint_FourHundred_ShouldReturnLAscii() {
        String expected = C_Expected + D_Expected;
        assertEquals(expected, RomanPrinter.print(400));
    }
    
    @Test
    public void testPrint_FiveHundred_ShouldReturnLAscii() {
        String expected = D_Expected;
        assertEquals(expected, RomanPrinter.print(500));
    }

    @Test
    public void testPrint_NineHundred_ShouldReturnLAscii() {
        String expected = C_Expected + M_Expected;
        assertEquals(expected, RomanPrinter.print(900));
    }

    @Test
    public void testPrint_Thpusand_ShouldReturnLAscii() {
        String expected = M_Expected;
        assertEquals(expected, RomanPrinter.print(1000));
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
