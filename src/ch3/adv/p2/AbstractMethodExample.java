package ch3.adv.p2;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        animalSound(new Dog());
        animalSound(new Cat());

    }
    //static인 메서드에서 메서드를 호출하려면 호출 메서드도
    //static이어야함
    public static void animalSound(Animal animal){
        animal.sound();
    }
}
