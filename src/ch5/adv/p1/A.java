package ch5.adv.p1;

public class A {
    //인스턴스

    //필드
    String field = "A field";

    //메서드
    void method(){
        System.out.println("A method");
    }

    //인스턴스 멤버 클래스
    class B {
        //B 인스턴스 필드
        String field = "B field";
        //B 인스턴스 메서드
        void method(){
            System.out.println("B method");
        }
        //B 인스턴스 메서드
        void print() {
            //B 객체 필드& 메서드 사용
            System.out.println(this.field);
            this.method();
            //A객체 필드 & 메서드 사용
            System.out.println(A.this.field);
            A.this.method();
        }
    }
    //A 인스턴스 메서드
    void useB(){
        B b = new B();
        b.print();
    }
}
