package ch2.adv;

public class InputExample {
    public static void main(String[] args) {
        String name = Input.read("이름: ");
        String hobby = Input.read("취미", "독서"); // 엔터 치면 "독서"
        int age = Input.readInt("나이: ");

        boolean isSave = Input.confirm("저장하시겠습니까?");

        System.out.println("--- 결과 ---");
        System.out.println(name + "(" + age + ")님의 취미는 " + hobby + "입니다.");
        System.out.println("저장 여부: " + isSave);
    }

}
