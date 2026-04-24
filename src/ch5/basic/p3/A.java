package ch5.basic.p3;

public class A {
    static class B {
    }

    //인스턴스 필드값으로 B객체
    B field = new B();

    //정적 필드 값으로 B객체 대입
    static B field2 = new B();

    //생성자
    A(){
        B b = new B();
    }

    //인스턴스 메서드
    void method1(){
        B b = new B();
    }

    //정적 메서드
    static void method2(){
        B b = new B();
    }
}
