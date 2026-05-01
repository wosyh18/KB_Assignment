package ch11.p7;

//Comparable 인터페이스를 구현하여 score 비교하기
public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.score, o.score);
    }
}
