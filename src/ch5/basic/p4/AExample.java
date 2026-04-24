package ch5.basic.p4;

public class AExample {
    public static void main(String[] args) {
        A.B b = new A.B();

        System.out.println(b.field);
        b.method1();
        System.out.println(b.field2);
        b.method2();
    }
}
