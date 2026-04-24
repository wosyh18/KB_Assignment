package ch5.basic.p1;

public class A {
    //인스턴스 멤버 클래스
    class B { }

    //A객체가 생성되면 B객체도 자동으로 생성되어
    //필드에 담김
    B field = new B();

    A(){
        B b = new B();
    }

    void method(){
        B b = new B();
    }
}
