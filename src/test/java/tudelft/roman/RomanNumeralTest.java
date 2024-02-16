package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @BeforeEach
    public  void initialize() {
        System.out.println("This method called before each test!");
    }
    @Test
    void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("V");
        Assertions.assertEquals(5, result);
    }

    @Test
    void numberWithManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);

        result = roman.convert("XIII");
        Assertions.assertEquals(13, result);
    }

    @Test
    void numberWithSubstractionNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IX");
        Assertions.assertEquals(9, result);
    }

    @Test
    void numberWithMoreThanOneTen() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XXXI");
        Assertions.assertEquals(31, result);
    }

    @Test
    void numberWithSubstractionAndWithoutSubstractionNotation (){
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLI");
        Assertions.assertEquals(41, result);
    }

    @Test
    void numberWithFourDigit() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MDCCC");
        Assertions.assertEquals(1800, result);
    }

    @Test
    void numberWithBiggestValue() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MMMCMXCIX");
        Assertions.assertEquals(3999, result);
    }
}
