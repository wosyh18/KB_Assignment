package ch4.basic.p2;

public class SmartTelevision implements RemoteControl3, Searchable{

    @Override
    public void turnOn() {
        System.out.println("스마트 티비 전원을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트 티비 전원을 끕니다");
    }

    @Override
    public void search(String url) {
        System.out.println(url +"을 검색합니다");
    }
}
