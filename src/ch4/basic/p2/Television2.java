package ch4.basic.p2;

public class Television2 implements RemoteControl2 {
    private int volume;


    @Override
    public void turnOn() {
        System.out.println("tv를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("tv를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;

        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        }
        else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        }

        System.out.println("현재 tv볼륨: " + this.volume);
    }
}
