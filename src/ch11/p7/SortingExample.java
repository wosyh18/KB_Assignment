package ch11.p7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 10));
        studentList.add(new Student("유미선", 20));

        //student 클래스에 comparTo 를 구현했을 경우
        //점수를 기준으로 오름차순 정렬한 새 스트림 얻기
        studentList.stream().sorted().forEach(System.out::println);
        //내림차순
        studentList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
