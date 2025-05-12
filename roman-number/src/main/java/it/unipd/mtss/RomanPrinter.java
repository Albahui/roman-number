////////////////////////////////////////////////////////////////////
// [Maria Fuensanta] [Trigueros Hernandez] [2133487]
// [Alba Hui] [Larrosa Serrano] [2133266]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
     private static final String[] I_Rep = {
        "    _____    ",
        "   |_   _|   ",
        "     | |     ",
        "     | |     ",
        "     | |     ",
        "    _| |_    ",
        "   |_____|   "
    };

    private static final String[] V_Rep = {
        " __       __ ",
        " \\ \\     / / ",
        "  \\ \\   / /  ",
        "   \\ \\ / /   ",
        "    \\ V /    ",
        "     \\  /    ",
        "      \\/     "
    };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            throw new IllegalArgumentException("The roman number could not be null or empty");
        }

        if (!romanNumber.matches("[IVXLCDM]+")) {
            throw new IllegalArgumentException("The roman number has invalid characters");
        }

        String[] result = new String[7];
        for (int i = 0; i < 7; i++) {
            result[i] = "";
        }

        for (int i = 0; i < romanNumber.length(); i++) {
            char romanChar = romanNumber.charAt(i);
            String[] rep;

            switch (romanChar) {
                case 'I':
                    rep = I_Rep;
                    break;
                case 'V':
                    rep = V_Rep;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid character: " + romanChar);
            }

            for (int j = 0; j < 7; j++) {
                result[j] += rep[j];
            }
        }
        
        return String.join("\n", result);
    }
}
