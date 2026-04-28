package ch8.basic.p3;

public class HomeAgency implements Rentable<Home>{
    public Home rent(){
        return new Home();
    }
}
