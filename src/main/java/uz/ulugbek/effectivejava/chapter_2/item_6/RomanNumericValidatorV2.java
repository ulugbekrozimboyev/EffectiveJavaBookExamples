package uz.ulugbek.effectivejava.chapter_2.item_6;

import java.util.regex.Pattern;

public class RomanNumericValidatorV2 {

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    public static boolean isRomanNumeric(String s) {
        return ROMAN.matcher(s).matches();
    }

}
