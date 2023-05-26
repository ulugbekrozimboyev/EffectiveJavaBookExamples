package uz.ulugbek.effectivejava.chapter_2.item_6;

public class SumIntValues {

    public static long sum() {
        Long sum = 0l;
        for (long i = 0; i <= Integer.MAX_VALUE; i++ ) {
            sum += i;
        }

        return sum;
    }

    public static long sumV2() {
        long sum = 0l;
        for (long i = 0; i <= Integer.MAX_VALUE; i++ ) {
            sum += i;
        }

        return sum;
    }

}
