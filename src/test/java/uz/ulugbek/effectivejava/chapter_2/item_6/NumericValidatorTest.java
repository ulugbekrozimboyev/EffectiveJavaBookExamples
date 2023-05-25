package uz.ulugbek.effectivejava.chapter_2.item_6;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumericValidatorTest {

    List<String> correctValues = List.of("III", "VI", "XXII", "CLV", "XX", "LV");
    List<String> incorrectValues = List.of("1234", "XXi", "2XX", "vL", "X2", "VX");

    @Test
    public void testIsRomanNumeric() {
        long start = System.currentTimeMillis();
        System.out.println("test one is start at: " + start);

        correctValues.forEach(number -> assertTrue(RomanNumericValidator.isRomanNumeric(number)));
        incorrectValues.forEach(number -> assertFalse(RomanNumericValidator.isRomanNumeric(number)));

        System.out.println("test one is finished at: " + (System.currentTimeMillis() - start));
    }

    @Test
    public void testIsRomanNumericV2() {
        long start = System.currentTimeMillis();
        System.out.println("test two is start at: " + start);

        correctValues.forEach(number -> assertTrue(RomanNumericValidator.isRomanNumericV2(number)));
        incorrectValues.forEach(number -> assertFalse(RomanNumericValidator.isRomanNumericV2(number)));

        System.out.println("test two is finished at: " + (System.currentTimeMillis() - start));
    }


}