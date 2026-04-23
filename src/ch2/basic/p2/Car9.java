package ch2.basic.p2;

public class Car9 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car9() {
    }

    Car9 (String model) {
        this(model, "은색", 250);
    }
    Car9 (String model, String color) {
        this(model, color, 250);
    }
    Car9 (String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
