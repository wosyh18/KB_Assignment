package ch5.basic.p4;

public class A {
    static class B{
        int field = 1;

        static int field2 = 2;

        //생성자
        B(){
            System.out.println("B생성자 실행");
        }

        //인스턴스 메서드
        void method1(){
            System.out.println("B method1 실행");
        }

        //정적 메서드
        static void method2(){
            System.out.println("B method2 실행");
        }
    }
}
