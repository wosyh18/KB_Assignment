package ch11.p1;

import java.util.HashSet;

public class StreamExample {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        set.stream().forEach(System.out::println);
    }
}
