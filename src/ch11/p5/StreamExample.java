package ch11.p5;

import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동","신용권","김미나"};

        Arrays.stream(strArray).forEach(System.out::println);

        int[] intArray = {1,2,3,4,5};

        Arrays.stream(intArray).forEach(System.out::println);

    }
}
