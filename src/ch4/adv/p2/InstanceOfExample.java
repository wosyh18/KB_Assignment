package ch4.adv.p2;

public class InstanceOfExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        Bus bus = new Bus();

        ride(taxi);
        ride(bus);

    }

    public static void ride(Vehicle v) {
        v.run();

        //instanceof 연산자 통해 타입 확인
        if (v instanceof Bus) {
            //v를 강제 타입 변환
            Bus bus = (Bus) v;
            bus.checkFare();
        }
    }
}
