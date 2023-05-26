package uz.ulugbek.effectivejava.chapter_2.item_6;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumericValidatorTest {

    public static List<String> correctValues =
            List.of("I", "III", "II",
                    "V", "IV", "VI", "VII", "VIII",
                    "IX", "X", "XI", "XV", "XIV", "XVI", "XX", "XXII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                    "L", "XL", "XLI", "XLII", "XLIII", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "LI", "LII", "LIII", "LIV", "LV", "LVI","LVII", "LVIII", "LX","LXI","LXII","LXIII", "LXIV","LXV","LXVI","LXVII", "LXVIII",
                    "C", "CLV", "CX", "XC",
                    "D", "CD", "DC",
                    "M", "MD", "CM", "MC", "MMC");
    List<String> incorrectValues = List.of("1234", "XXi", "2XX", "vL", "X2", "VX");

//    @Test
    @RepeatedTest(value = 10)
    public void testIsRomanNumeric() {
        long start = System.currentTimeMillis();
        System.out.println("test one is start at: " + start);

        correctValues.forEach(number -> {
//            System.out.println(number);
            assertTrue(RomanNumericValidatorV2.isRomanNumeric(number));
        });
//        incorrectValues.forEach(number -> assertFalse(RomanNumericValidator.isRomanNumeric(number)));

        System.out.println("test one is finished at: " + (System.currentTimeMillis() - start));
    }

}