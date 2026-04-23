package ch2.basic.p10;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(-50);

        car.setSpeed(50);

        car.setStop(true);

        System.out.printf("현재속도: %d", car.getSpeed());
    }
}
