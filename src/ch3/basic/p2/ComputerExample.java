package ch3.basic.p2;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Calculator calculator = new Calculator();

        System.out.println(computer.areaCircle(5));
        System.out.println(calculator.areaCircle(5));
    }
}
