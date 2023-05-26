package uz.ulugbek.effectivejava.chapter_2.item_6;

import org.junit.jupiter.api.RepeatedTest;

class SumIntValuesTest {

    @RepeatedTest(value = 5)
    public void testSum() {
        long start = System.currentTimeMillis();
        System.out.println("test v1 is start");

        long sum = SumIntValues.sum();

        System.out.println("test v1 is finished at: " + (System.currentTimeMillis() - start));
    }

    @RepeatedTest(value = 5)
    public void testSumV2() {
        long start = System.currentTimeMillis();
        System.out.println("test v2 is start");

        long sum = SumIntValues.sumV2();

        System.out.println("test v2 is finished at: " + (System.currentTimeMillis() - start));
    }

}