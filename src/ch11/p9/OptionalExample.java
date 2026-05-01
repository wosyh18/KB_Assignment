package ch11.p9;

import java.util.ArrayList;
import java.util.List;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        double avg = list.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);
        System.out.println("평균: "+ avg);
    }
}
