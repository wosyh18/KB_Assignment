package ch2.basic.p7;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("현대자동차");

        car.setSpeed(50);
        car.getSpeed();
        car.run();
    }
}
