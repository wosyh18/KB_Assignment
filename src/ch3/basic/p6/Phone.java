package ch3.basic.p6;

public abstract class Phone {
    String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public abstract void turnOn();
    public abstract void turnOff();

}
