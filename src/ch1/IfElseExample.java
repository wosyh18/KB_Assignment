package ch1;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;
        if ( score == 85 ) {
            System.out.println("점수가 90보다 작습니다.\n등급은 B입니다.");
        }
        else if ( score == 93 ) {
            System.out.println("점수가 90보다 큽니다.\n등급은 A입니다.");
        }
    }
}
