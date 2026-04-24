package ch5.basic.p1;

public class AExample {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();
    }
}
