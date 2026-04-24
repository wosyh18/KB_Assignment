package ch5.basic.p6;

public class Home {
    RemoteControl remoteControl = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("tv를 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("tv를 끕니다");
        }
    };

    public void use1(){
        remoteControl.turnOn();
        remoteControl.turnOff();
    }

}
