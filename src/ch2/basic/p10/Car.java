package ch2.basic.p10;

public class Car {
    private int speed;
    private boolean stop;

    public void setSpeed(int speed) {
        this.speed = speed;
        if ( speed <= 0){
            this.speed = 0;
        }
        System.out.println("현재속도 " + this.speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setStop(boolean stop) {
        if ( stop ){
            this.speed = 0;
        }
        this.stop = stop;
    }
}
