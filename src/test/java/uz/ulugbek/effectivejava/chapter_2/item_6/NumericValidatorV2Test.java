package uz.ulugbek.effectivejava.chapter_2.item_6;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumericValidatorV2Test {

//    @Test
    @RepeatedTest(value = 10)
    public void testIsRomanNumericV2() {
        long start = System.currentTimeMillis();
        System.out.println("test two is start at: " + start);

        NumericValidatorTest.correctValues.forEach(number -> {
//            System.out.println(number);
            assertTrue(RomanNumericValidatorV2.isRomanNumeric(number));
        });
        NumericValidatorTest.incorrectValues.forEach(number -> assertFalse(RomanNumericValidatorV2.isRomanNumeric(number)));

        System.out.println("test two is finished at: " + (System.currentTimeMillis() - start));
    }


}