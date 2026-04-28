package ch8.adv.p1;

public class GenericExample {
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box = boxing(100);
    }
}
