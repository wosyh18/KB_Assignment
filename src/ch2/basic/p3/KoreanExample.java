package ch2.basic.p3;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바", "011225-1234567");

        Korean k2 = new Korean("김자바", "3902390");

        System.out.printf("k1.nation:%s\nk1.name:%s\nk1.ssn:%s\n", k1.nation, k1.name, k1.ssn);
        System.out.printf("k2.nation:%s\nk2.name:%s\nk2.ssn:%s\n", k2.nation, k2.name, k2.ssn);

    }
}
