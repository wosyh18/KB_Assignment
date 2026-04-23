package ch4.basic.p2;

public class RemoteControlExample2 {
    public static void main(String[] args) {
        RemoteControl2 rc;

        rc = new Television2();

        rc.turnOn();
        rc.setVolume(34);
        rc.turnOff();

        rc = new Audio2();
        rc.turnOn();
        rc.setVolume(34);
        rc.turnOff();
    }
}
