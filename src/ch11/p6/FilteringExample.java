package ch11.p6;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        list.stream().distinct().forEach(System.out::println);

        list.stream().filter(i -> i.startsWith("신")).forEach(System.out::println);

        list.stream().distinct().filter(i->i.startsWith("신")).forEach(System.out::println);
    }
}
