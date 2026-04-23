package ch2.basic.p7;

public class Car {
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }

    public int getSpeed() {
        System.out.println("speed" + speed);
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.printf("%s가 달립니다.(시속: %dkm/h)\n", model, speed);
    }
}
