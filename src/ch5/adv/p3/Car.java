package ch5.adv.p3;

public class Car {
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
        }
    };

    public void run1() {
        tire1.roll(); // 일반 Tire의 roll() 실행
        tire2.roll(); // 익명 자식 객체에서 재정의한 roll() 실행
    }

    public void run2() {
        Tire tire = new Tire(){
            @Override
            public void roll() {
                System.out.println("익명자식 tire 객체 2가 굴러갑니다");
            }
        };
    }

    public void run3(Tire tire) {
        tire.roll();
    }

}
