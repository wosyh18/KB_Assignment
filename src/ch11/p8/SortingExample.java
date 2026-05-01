package ch11.p8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 30));
        studentList.add(new Student("신용권", 10));
        studentList.add(new Student("유미선", 20));

        //점수를 기준으로 오름차순
        studentList.stream().sorted(Comparator.comparingInt(Student::getScore).reversed()).forEach(System.out::println);
        studentList.stream().sorted(Comparator.comparingInt(Student::getScore)).forEach(System.out::println);
    }
}
