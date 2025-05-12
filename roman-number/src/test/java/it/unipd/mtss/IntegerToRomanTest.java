////////////////////////////////////////////////////////////////////
// [Maria Fuensanta] [Trigueros Hernandez] [2133487]
// [Alba Hui] [Larrosa Serrano] [2133266]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerToRomanTest {

    // Test: Numero corretto    
    @Test
    public void testConvert_One_ShouldReturnI() {
        // Arrange
        int number = 1;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("I", result);
    }

    @Test
    public void testConvert_Two_ShouldReturnII() {
        // Arrange
        int number = 2;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("II", result);
    }

    @Test
    public void testConvert_Three_ShouldReturnIII() {
        // Arrange
        int number = 3;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("III", result);
    }

    @Test
    public void testConvert_Four_ShouldReturnIV() {
        // Arrange
        int number = 4;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("IV", result);
    }

    @Test
    public void testConvert_Five_ShouldReturnV() {
        // Arrange
        int number = 5;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("V", result);
    }

     @Test
    public void testConvert_Six_ShouldReturnVI() {
        // Arrange
        int number = 6;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("VI", result);
    }
    @Test
    public void testConvert_Nine_ShouldReturnIX() {
        // Arrange
        int number = 9;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("IV", result);
    }
    @Test
    public void testConvert_Ten_ShouldReturnX() {
        // Arrange
        int number = 10;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("X", result);
    }

    @Test
    public void testConvert_Twenty_ShouldReturnXX() {
        // Arrange
        int number = 20;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("XX", result);
    }
    @Test
    public void testConvert_ThirtyTwo_ShouldReturnX() {
        // Arrange
        int number = 32;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("XXXII", result);
    }
    @Test
    public void testConvert_Fhourty_ShouldReturnX() {
        // Arrange
        int number = 40;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("XL", result);
    }
    @Test
    public void testConvert_FhourtyNine_ShouldReturnX() {
        // Arrange
        int number = 49;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("XLIX", result);
    }
    @Test
    public void testConvert_FIFTY_ShouldReturnX() {
        // Arrange
        int number = 50;

        // Act
        String result = IntegerToRoman.convert(number);

        // Assert
        assertEquals("L", result);
    }



    // Test: Numero fuori 
    @Test(expected = IllegalArgumentException.class)
    public void testConvert_Zero_ShouldThrowException() {
        // Arrange
        int number = 0;

        // Act & Assert
        IntegerToRoman.convert(number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_Negative_ShouldThrowException() {
        // Arrange
        int number = -1;

        // Act & Assert
        IntegerToRoman.convert(number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvert_GreaterThanTen_ShouldThrowException() {
        // Arrange
        int number = 52;

        // Act & Assert
        IntegerToRoman.convert(number);
    }
}
