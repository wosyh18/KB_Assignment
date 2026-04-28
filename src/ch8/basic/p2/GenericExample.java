package ch8.basic.p2;

public class GenericExample {
    public static void main(String[] args) {
        Product<TV>product1 = new Product<>();
        product1.setKind(new TV());
        product1.setModel("스마트TV");

        TV tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car> product2 = new Product<>();

        product2.setKind(new Car());
        String carModel = product2.getModel();
    }
}
