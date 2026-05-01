package ch11.p9;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};

        long v = Arrays.stream(arr)
                .filter(i->i % 2 == 0)
                .count();

        System.out.println("2의 배수 갯수:" + v );

        int s= Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .sum();
        System.out.println("2의 배수의 합: "+s);

        double a= Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .average()
                        .getAsDouble(); //반환타입 주의
        System.out.println("2의 배수의 평균: "+s);

        int max = Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("최대값 " + max);

        int min = Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("최소삾 " + min);

        int first = Arrays.stream(arr)
                .filter(i -> i % 2 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("첫번째 3의 배수 + first");
    }
}
