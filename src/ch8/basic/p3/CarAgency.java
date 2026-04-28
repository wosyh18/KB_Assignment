package ch8.basic.p3;

public class CarAgency implements Rentable<Car>{
    public Car rent(){
        return new Car();
    }
}
