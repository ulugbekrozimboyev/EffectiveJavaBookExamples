package uz.ulugbek.effectivejava.chapter_2.item_6;

import java.util.regex.Pattern;

public class RomanNumericValidator {

    public static boolean isRomanNumeric(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

}
